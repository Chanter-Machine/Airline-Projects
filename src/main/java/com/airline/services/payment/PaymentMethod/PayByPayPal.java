package com.airline.services.payment.PaymentMethod;

import com.airline.bean.PayPal;
import com.airline.dao.PayPalMapper;
import com.airline.dto.ApplicationConfiguration;
import com.airline.dto.CreatePaymentDto;
import com.airline.dto.TransactionAmountDto;
import com.airline.dto.TransactionDetailsDto;
import com.airline.utils.PayPalHelper;
import com.airline.utils.RestClient;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

@Component("PayByPayPal")
public class PayByPayPal implements IPaymentMethod {

    private String paymentType = "PayPal";

    @Autowired
    private PayPalMapper payPalMapper;

    public String pay(HttpServletRequest request, HttpServletResponse response) {
        //obtain the paypal config
        ApplicationConfiguration ac = (ApplicationConfiguration) request.getServletContext().getAttribute("config");
        String paymentId = null;
        //according to the step_of_payment to execute different method
        if ("create_payment".equals(request.getParameter("step_of_payment"))) {
            try {
                JSONObject jsonObject = CreatePayment(ac, request);
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

    @Override
    public boolean refund(HttpServletRequest request, HttpServletResponse response) {
        return false;
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
}
