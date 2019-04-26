package com.airline.services.payment.command;

import com.airline.bean.*;
import com.airline.bean.Order;
import com.airline.dao.OrderMapper;
import com.airline.dao.PayPalMapper;
import com.airline.dao.PaymentrecordMapper;
import com.airline.dto.ApplicationConfiguration;
import com.airline.dto.CreatePaymentDto;
import com.airline.dto.TransactionAmountDto;
import com.airline.dto.TransactionDetailsDto;
import com.airline.services.payment.PaymentMethod.PaymentMethodFactory;
import com.airline.utils.PayPalHelper;
import com.airline.utils.RestClient;
import com.paypal.api.payments.*;
import com.paypal.base.Constants;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

@Component("PayWithPayPal")
public class PayWithPayPal implements PaymentCommand {


    @Autowired
    OrderMapper orderMapper;

    @Autowired
    PaymentrecordMapper paymentrecordMapper;

    @Autowired
    PayPalMapper payPalMapper;

    public String pay(HttpServletRequest request, HttpServletResponse response) {
        //obtain the paypal config
        ApplicationConfiguration ac = (ApplicationConfiguration) request.getServletContext().getAttribute("config");
        String paymentId = null;
        //according to the step_of_payment to execute different method
        if ("create_payment".equals(request.getParameter("step_of_payment"))) {
            try {
                JSONObject jsonObject = CreatePayment(ac, request);
                System.out.println(jsonObject);
                paymentId = jsonObject.getString("id");
                response.setContentType("application/json");
                response.setStatus(200);
                PrintWriter out = response.getWriter();
                out.print(jsonObject); // post back the object to invoker
            } catch (IOException e) {
                e.printStackTrace();
            }
            return paymentId;
        } else if ("execute_payment".equals(request.getParameter("step_of_payment"))) {
            JSONObject jsonObject = null;
            try {
                jsonObject = ExecutePayment(ac, request);
                if ("approved".equals(jsonObject.get("state"))) {
                    PayPal payPal = new PayPal();
                    paymentId = jsonObject.getString("id");
                    payPal.setPaypalid(paymentId);
                    payPal.setIntent(jsonObject.getString("intent"));
                    payPal.setPaymentstate(jsonObject.getString("state"));

                    JSONArray transactions = jsonObject.getJSONArray("transactions");
                    JSONObject firstObject = transactions.getJSONObject(0);
                    payPal.setTotalamount(firstObject.getJSONObject("amount").getString("total"));
                    payPal.setInvoicenumber(firstObject.getString("invoice_number").substring(12));


                    JSONObject payer = jsonObject.getJSONObject("payer");
                    payPal.setPaymentmethod(payer.getString("payment_method"));

                    JSONObject payer_info = payer.getJSONObject("payer_info");
                    payPal.setPayerid(payer_info.getString("payer_id"));
                    payPal.setFirstname(payer_info.getString("first_name"));
                    payPal.setLastname(payer_info.getString("last_name"));

                    payPal.setEmail(payer_info.getString("email"));
                    payPal.setCountrycode(payer_info.getJSONObject("shipping_address").getString("country_code"));

                    payPalMapper.insert(payPal);
                }
                response.setContentType("application/json");
                response.setStatus(200);
                PrintWriter out = response.getWriter();
                out.print(jsonObject);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return paymentId;
        } else {
            return paymentId;
        }
    }


    public JSONObject CreatePayment(ApplicationConfiguration ac, HttpServletRequest request) throws IOException {
        CreatePaymentDto createPaymentDto = getCreatePaymentObject(request);
        RestClient restClient = new RestClient();
        JSONObject accessTokenObjectFromPayPalServer = restClient.getAccessToken(ac.getClientId(), ac.getSecret(), ac.getAccessTokenUrl(), ac.getBnCode());
        String accessToken = accessTokenObjectFromPayPalServer.getString("access_token");
        JSONObject dataFromCreatePaymentsAPI = restClient.createPayment(accessToken, ac.getCreatePaymentsUrl(), createPaymentDto, ac.getBnCode());
        return dataFromCreatePaymentsAPI;
    }

    public JSONObject ExecutePayment(ApplicationConfiguration ac, HttpServletRequest request) throws IOException {

        String jsonFromHtml = readInputStreamForData(request); // holding the json from request
        JSONObject dataToSend = getExecutePaymentObject(jsonFromHtml); // helper to get execute payment API payload

        // look for shipping method,
        //if amount greater than 0.00 then update the amount Object and post with payload
        String url = getUrl(jsonFromHtml, ac); // helper to get url from properties file and append payerId to it.

        RestClient restClient = new RestClient();
        JSONObject accessTokenObjectFromPayPalServer = restClient.getAccessToken(ac.getClientId(), ac.getSecret(), ac.getAccessTokenUrl(), ac.getBnCode());
        String accessToken = accessTokenObjectFromPayPalServer.getString("access_token");

        JSONObject dataFromExecutePaymentAPI = restClient.executePayment(accessToken, url, dataToSend, ac.getBnCode());

        return dataFromExecutePaymentAPI;
    }

    private CreatePaymentDto getCreatePaymentObject(HttpServletRequest request) throws IOException {
        String BASEURL = request.getScheme() + "://" + request.getServerName() + ((request.getServerPort() == 80) ? "" : ":" + request.getServerPort()) + request.getContextPath();
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String json = "";
        if (br != null) {
            json = br.readLine();
        }

        JSONObject dataFromHtml = new JSONObject(json);
        PayPalHelper helper = new PayPalHelper();
        ApplicationConfiguration ac = (ApplicationConfiguration) request.getServletContext().getAttribute("config");
        CreatePaymentDto createPaymentDto = helper.getCreatePaymentData(BASEURL, dataFromHtml, ac.getReturnUrl(), ac.getCancelUrl());
        return createPaymentDto;

    }

    private String getUrl(String jsonFromHtml, ApplicationConfiguration ac) throws IOException {
        String url = ac.getExecutePaymentsUrl().trim();
        JSONObject json = new JSONObject(jsonFromHtml);
        url = url.replace("{payment_id}", json.getString("paymentID"));
        return url;
    }

    private String readInputStreamForData(HttpServletRequest request) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String json = "";
        if (br != null) {
            json = br.readLine();
        }
        return json;
    }

    private JSONObject getExecutePaymentObject(String jsonFromHtml) throws IOException {
        JSONObject json = new JSONObject(jsonFromHtml);
        JSONObject dataToSend = new JSONObject();
        dataToSend.put("payer_id", json.getString("payerID"));
        return dataToSend;
    }

    private JSONObject getShippingMethod(String jsonFromHtml) throws IOException {
        JSONObject json = new JSONObject(jsonFromHtml);
        JSONObject dataToSend = new JSONObject();

        TransactionAmountDto transaction = new TransactionAmountDto();
        transaction.setCurrency(json.getString("currency"));
        Double totalSAmount = Double.parseDouble(json.getString("amount")) + Double.parseDouble(json.getString("shippingMethodAmount"));
        transaction.setTotal(totalSAmount.toString());
        TransactionDetailsDto transactionDto = new TransactionDetailsDto();
        transactionDto.setSubtotal(json.getString("amount"));
        transactionDto.setShipping(json.getString("shippingMethodAmount"));
        transaction.setDetails(transactionDto);
        JSONObject jsonAmountAsString = new JSONObject(transaction);
        dataToSend.put("amount", jsonAmountAsString);
        return dataToSend;

    }

    public String getPaymentDetails(String paymentId, String accessToken, String clientId, String secret) {
        String PAYMENT_DETAIL = "https://api.sandbox.paypal.com/v1/payments/payment/";

        try {
            URL url = new URL(PAYMENT_DETAIL + paymentId);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");// 提交模式
            //设置请求头header
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization", "Bearer " + accessToken);
            // conn.setConnectTimeout(10000);//连接超时 单位毫秒
            // conn.setReadTimeout(2000);//读取超时 单位毫秒
            InputStreamReader inStream = new InputStreamReader(conn.getInputStream());
            BufferedReader reader = new BufferedReader(inStream);
            StringBuilder result = new StringBuilder();
            String lineTxt = null;
            while ((lineTxt = reader.readLine()) != null) {
                result.append(lineTxt);
            }
            reader.close();
            return result.toString();
        } catch (Exception err) {
            err.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean execute(HttpServletRequest request, HttpServletResponse response) {
        Integer orderId = (Integer) request.getAttribute("order_id");
        Order order = orderMapper.selectByPrimaryKey(orderId);
        Paymentrecord paymentrecord = paymentrecordMapper.selectByPrimaryKey(order.getPaymentid());

        String result = pay(request, response);
        if (result != null) {
            paymentrecord.setDate(new Date());
            paymentrecord.setStatus(Paymentrecord.PaidStatus);
            paymentrecord.setPaymenttype(PaymentMethodFactory.ByPayPal);
            paymentrecord.setThirtypartypaymentid(result);
            paymentrecordMapper.updateByPrimaryKey(paymentrecord);
            return true;
        }

        return false;
    }

    @Override
    public boolean undo(HttpServletRequest request, HttpServletResponse response) {
        Integer orderId = (Integer) request.getAttribute("order_id");

        Order order = orderMapper.selectByPrimaryKey(orderId);
        order.setStatus(Order.PendingStatus);
        int updatedOrderRows = orderMapper.updateByPrimaryKeySelective(order);

        Paymentrecord paymentrecord = paymentrecordMapper.selectByPrimaryKey(order.getPaymentid());
        paymentrecord.setStatus(Paymentrecord.PendingStatus);
        int updatedPRRows = paymentrecordMapper.updateByPrimaryKeySelective(paymentrecord);

        if (updatedOrderRows == 1 && updatedPRRows == 1) {
            return true;
        } else {
            return false;
        }
    }
}
