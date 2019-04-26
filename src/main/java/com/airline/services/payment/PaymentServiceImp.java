package com.airline.services.payment;

import com.airline.bean.*;
import com.airline.dao.OrderMapper;
import com.airline.dao.PaymentrecordMapper;
import com.airline.services.payment.PaymentMethod.PaymentMethodFactory;
import com.airline.services.payment.command.PayWithPayPal;
import com.airline.services.payment.command.PaymentCommand;
import com.airline.services.payment.command.RefundWithPayPal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Autowired
    private PaymentMethodFactory paymentMethodFactory;

    @Autowired
    @Qualifier("PayWithPayPal")
    private PaymentCommand payWithPayPaly;

    @Autowired
    @Qualifier("RefundWithPayPal")
    private PaymentCommand refundWithPayPal;

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
    public boolean pay(HttpServletRequest request, HttpServletResponse response, Order order, Integer paymentMethod) {
//        boolean isSuccessful = false;
//        Paymentrecord paymentrecord = paymentrecordMapper.selectByPrimaryKey(order.getPaymentid());
//        String result = paymentMethodFactory.getPaymentApproach(paymentMethod).pay(request, response);
//        if (result != null) {
//            paymentrecord.setDate(new Date());
//            paymentrecord.setStatus(Paymentrecord.PaidStatus);
//            paymentrecord.setPaymenttype(paymentMethod);
//            paymentrecord.setThirtypartypaymentid(result);
//            paymentrecordMapper.updateByPrimaryKey(paymentrecord);
//            isSuccessful = true;
//        }

        request.setAttribute("order_id", order.getOrderid());
        return payWithPayPaly.execute(request, response);

    }

    @Override
    public boolean refund(HttpServletRequest request, HttpServletResponse response) {
        boolean ret = refundWithPayPal.execute(request, response);
        if (ret) {
            Order order = orderMapper.selectByPrimaryKey(Integer.valueOf((String) request.getAttribute("order_id")));
            order.setStatus(Paymentrecord.RefundStatus);
            Paymentrecord paymentrecord = queryPayment(order);
            paymentrecord.setStatus(Paymentrecord.RefundStatus);

            orderMapper.updateByPrimaryKeySelective(order);
            paymentrecordMapper.updateByPrimaryKeySelective(paymentrecord);
            return true;
        }
        return false;
    }


    public Paymentrecord paymentIsPaid(Paymentrecord p) {
        p.setStatus(Paymentrecord.PaidStatus);

        paymentrecordMapper.updateByPrimaryKey(p);
        return p;
    }

}
