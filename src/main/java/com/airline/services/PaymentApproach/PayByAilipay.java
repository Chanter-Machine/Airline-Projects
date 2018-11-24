package com.airline.services.PaymentApproach;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PayByAilipay implements IPaymentApproach {

    @Override
    public boolean pay(HttpServletRequest request, HttpServletResponse response) {
        return false;
    }

    @Override
    public boolean refund(HttpServletRequest request, HttpServletResponse response) {
        return false;
    }
}
