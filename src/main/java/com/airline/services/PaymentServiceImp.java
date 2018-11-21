package com.airline.services;

import com.airline.bean.*;
import com.airline.dao.OrderMapper;
import com.airline.dao.PaymentrecordMapper;
import com.airline.services.PaymentApproach.IPaymentApproach;
import com.airline.services.PaymentApproach.PayByPayPal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentServiceImp implements IPaymentService {

    @Autowired
    private PaymentrecordMapper paymentrecordMapper;

    @Autowired
    private OrderMapper orderMapper;

    private IPaymentApproach paymentApproach;

    public PaymentServiceImp(HttpServletRequest request) {
        if (request.getParameter("payment_type").equals("paypal")) {
            this.paymentApproach = new PayByPayPal();
        } else {
            this.paymentApproach = null;
        }
    }

    public void setPaymentApproach(IPaymentApproach paymentApproach) {
        this.paymentApproach = paymentApproach;
    }

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

    @Override
    public boolean pay(HttpServletRequest request, HttpServletResponse response) {
        if (this.paymentApproach == null) {
            System.out.println("Error: paymentApproach is null");
            return false;
        }
        return paymentApproach.pay(request, response);
    }


}
