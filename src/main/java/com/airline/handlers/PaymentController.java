package com.airline.handlers;

import com.airline.bean.Order;
import com.airline.bean.Passenger;
import com.airline.bean.Paymentrecord;
import com.airline.services.IPaymentService;

import java.util.List;

public class PaymentController {
    private IPaymentService paymentService;

    //todo invoke patmentService.pay()
    public boolean makePayment() {
        return false;
    }

    //todo invoke paymentService.queryPayment()
    public Paymentrecord getPaymentDetail(Passenger passenger, Order order) {
        return null;
    }

    //todo invoke paymentService.queryPayment()
    public List<Paymentrecord> getPaymentDetails(Passenger passenger) {

        return null;
    }
}
