package com.airline.services.payment.PaymentMethod;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("PayByCurrencyFair")
public class PayByCurrencyFair implements IPaymentMethod {

    @Override
    public String pay(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public boolean refund(HttpServletRequest request, HttpServletResponse response) {
        return false;
    }
}
