package com.airline.services;

import com.airline.bean.*;
import com.airline.dao.OrderMapper;
import com.airline.dao.PaymentrecordMapper;
import com.airline.services.PaymentApproach.IPaymentApproach;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentServiceImp implements IPaymentService {

    @Autowired
    private PaymentrecordMapper paymentrecordMapper;

    @Autowired
    private OrderMapper orderMapper;

    private IPaymentApproach paymentApproach;

    public Paymentrecord queryPayment(Integer paymentId) {
        if (paymentId == null) {
            return null;
        }
        Paymentrecord paymentrecord = paymentrecordMapper.selectByPrimaryKey(paymentId);
        return paymentrecord;
    }

    public Paymentrecord queryPayment(Order order) {
        if (order == null) {
            return null;
        }
        Paymentrecord paymentrecords = paymentrecordMapper.selectByPrimaryKey(order.getPaymentid());
        return paymentrecords;
    }


    public List<Paymentrecord> queryPayments(Passenger passenger) {
        if (passenger == null) {
            return null;
        }

        ArrayList<Integer> paymentIdList = new ArrayList<Integer>();

        OrderExample orderExample = new OrderExample();
        orderExample.or().andPassageridEqualTo(passenger.getPassengerid());
        List<Order> orderList = orderMapper.selectByExample(orderExample);
        for (Order o :
                orderList) {
            paymentIdList.add(o.getPaymentid());
        }

        PaymentrecordExample paymentrecordExample = new PaymentrecordExample();
        paymentrecordExample.or().andPaymentidIn(paymentIdList);

        List<Paymentrecord> paymentrecordList = paymentrecordMapper.selectByExample(paymentrecordExample);
        return paymentrecordList;
    }

    //todo invoke PaymentApproach.pay();
    public boolean pay(Passenger passenger, Order order) {

        return false;
    }
}
