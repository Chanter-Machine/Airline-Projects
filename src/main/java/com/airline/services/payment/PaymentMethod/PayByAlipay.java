package com.airline.services.payment.PaymentMethod;

import com.airline.bean.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("PayByAlipay")
public class PayByAlipay implements IPaymentMethod {

    @Override
    public String pay(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public boolean refund(HttpServletRequest request, HttpServletResponse response, Order order) {
        return false;
    }


}
