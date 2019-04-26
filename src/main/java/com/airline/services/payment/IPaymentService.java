package com.airline.services.payment;

import com.airline.bean.Order;
import com.airline.bean.Passenger;
import com.airline.bean.Paymentrecord;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface IPaymentService {

    public Paymentrecord queryPayment(Integer paymentId);

    public Paymentrecord queryPayment(Order order);

    public List<Paymentrecord> queryPayments(Passenger passenger);

    public boolean pay(HttpServletRequest request, HttpServletResponse response, Order order, Integer paymentMethod);

    public boolean refund(HttpServletRequest request, HttpServletResponse response);

    public Paymentrecord paymentIsPaid(Paymentrecord p);


}
