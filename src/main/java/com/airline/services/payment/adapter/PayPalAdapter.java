package com.airline.services.payment.adapter;

import com.airline.bean.Order;
import com.airline.dto.ApplicationConfiguration;
import com.airline.services.payment.PaymentMethod.IPaymentMethod;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Refund;
import com.paypal.api.payments.Sale;
import com.paypal.base.Constants;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PayPalAdapter implements IPaymentMethod {
    @Override
    public String pay(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public boolean refund(HttpServletRequest request, HttpServletResponse response, Order order) {

        ApplicationConfiguration config = (ApplicationConfiguration) request.getServletContext().getAttribute("config");
        APIContext apiContext = new APIContext(config.getClientId(), config.getSecret(), Constants.SANDBOX);

        // 1. set up a Refund object
        Refund refund = new Refund();
        Amount amount = new Amount();
        amount.setTotal("1.31");
        amount.setCurrency("EUR");
        refund.setAmount(amount);

        // 2. get sale with id
        Sale sale = new Sale();
        sale.setId("1KH25376R0966643J");

        try {
            sale.refund(apiContext, refund);
        } catch (PayPalRESTException e) {
            System.err.println(e.getDetails());
        }


        return false;

    }

}
