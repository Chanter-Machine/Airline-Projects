package com.airline.services.PaymentApproach;

import com.airline.dto.ApplicationConfiguration;
import com.airline.dto.CreatePaymentDto;
import com.airline.dto.TransactionAmountDto;
import com.airline.dto.TransactionDetailsDto;
import com.airline.utils.PayPalHelper;
import com.airline.utils.RestClient;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PayByPayPal implements IPaymentApproach {

    public boolean pay(HttpServletRequest request, HttpServletResponse response) {
        //obtain the paypal config
        ApplicationConfiguration ac = (ApplicationConfiguration) request.getServletContext().getAttribute("config");

        //according to the step_of_payment to execute different method
        if ("create_payment".equals(request.getParameter("step_of_payment"))) {
            try {
                JSONObject jsonObject = CreatePayment(ac, request);
                response.setContentType("application/json");
                response.setStatus(200);
                PrintWriter out = response.getWriter();
                out.print(jsonObject); // post back the object to invoker
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        } else if ("execute_payment".equals(request.getParameter("step_of_payment"))) {
            JSONObject jsonObject = null;
            try {
                jsonObject = ExecutePayment(ac, request);
                response.setContentType("application/json");
                response.setStatus(200);
                PrintWriter out = response.getWriter();
                out.print(jsonObject);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        } else {
            return false;
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
