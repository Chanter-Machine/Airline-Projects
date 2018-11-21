package com.airline.services.PaymentApproach;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IPaymentApproach {

    public boolean pay(HttpServletRequest request, HttpServletResponse response);

    public boolean refund(HttpServletRequest request, HttpServletResponse response);
}
