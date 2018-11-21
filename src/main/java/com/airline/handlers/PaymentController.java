package com.airline.handlers;

import com.airline.bean.Order;
import com.airline.bean.Passenger;
import com.airline.bean.Paymentrecord;
import com.airline.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @RequestMapping("/pay")
    public void pay(HttpServletRequest request, HttpServletResponse response) {
        paymentService.pay(request, response);
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
