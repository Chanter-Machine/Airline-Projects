package com.airline.handlers;

import com.airline.bean.Order;
import com.airline.bean.Passenger;
import com.airline.bean.Paymentrecord;
import com.airline.services.payment.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @RequestMapping("/pay.do")
    public void pay(HttpServletRequest request, HttpServletResponse response, Order order, @RequestParam("payment_method") Integer paymentMethod) {
        paymentService.pay(request, response, order, paymentMethod);
    }

    // invoke paymentService.queryPayment()
    public Paymentrecord getPaymentDetail(Passenger passenger, Order order) {
        return paymentService.queryPayment(order);
    }

    // invoke paymentService.queryPayments()
    public List<Paymentrecord> getPaymentDetails(Passenger passenger) {
        return paymentService.queryPayments(passenger);
    }
}
