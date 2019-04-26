package com.airline.services.payment.command;

import com.airline.bean.*;
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
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Refund;
import com.paypal.api.payments.Sale;
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

@Component("RefundWithPayPal")
public class RefundWithPayPal implements PaymentCommand {


    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private PaymentrecordMapper paymentrecordMapper;


    @Override
    public boolean execute(HttpServletRequest request, HttpServletResponse response) {
        return refund(request, response);
    }

    @Override
    public boolean undo(HttpServletRequest request, HttpServletResponse response) {
        //this command is not supported to undo.
        return false;
    }


    public boolean refund(HttpServletRequest request, HttpServletResponse response) {
        ApplicationConfiguration ac = (ApplicationConfiguration) request.getServletContext().getAttribute("config");
        Integer order_id = Integer.valueOf((String) request.getAttribute("order_id"));
        Order order = orderMapper.selectByPrimaryKey(order_id);
        RestClient restClient = new RestClient();
        String accessToken = null;

        try {
            accessToken = restClient.getAccessToken(ac.getClientId(), ac.getSecret(), ac.getAccessTokenUrl(), ac.getBnCode()).getString("access_token");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Paymentrecord paymentrecord = paymentrecordMapper.selectByPrimaryKey(order.getPaymentid());
        String paymentDetails = getPaymentDetails(paymentrecord.getThirtypartypaymentid(), accessToken, ac.getClientId(), ac.getSecret());
        JSONObject jsonObject = new JSONObject(paymentDetails);

        System.out.println(paymentDetails);

        JSONArray transactions = jsonObject.getJSONArray("transactions");
        JSONArray related_resources = transactions.getJSONObject(0).getJSONArray("related_resources");
        JSONObject sale = related_resources.getJSONObject(0).getJSONObject("sale");
        String saleId = sale.getString("id");
        String totalRefund = sale.getJSONObject("amount").getString("total");
        String currency = sale.getJSONObject("amount").getString("currency");

        Refund refund = new Refund();
        Amount amount = new Amount();
        amount.setTotal(totalRefund);
        amount.setCurrency(currency);
        refund.setAmount(amount);
        refund.setDescription("Refund Order");

        Sale saleToRefund = new Sale();
        saleToRefund.setId(saleId);

        APIContext apiContext = new APIContext(ac.getClientId(), ac.getSecret(), Constants.SANDBOX);

        try {
            saleToRefund.refund(apiContext, refund);
        } catch (PayPalRESTException e) {
            System.err.println(e.getDetails());
            return false;
        }

        return true;
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

}
