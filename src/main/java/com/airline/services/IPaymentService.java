package com.airline.services;

import com.airline.bean.Order;
import com.airline.bean.Passenger;
import com.airline.bean.Paymentrecord;

import java.util.List;

public interface IPaymentService {

    public Paymentrecord queryPayment(Integer paymentId);

    public Paymentrecord queryPayment(Order order);

    public List<Paymentrecord> queryPayments(Passenger passenger);

    public boolean pay(Passenger passenger, Order order);
}
