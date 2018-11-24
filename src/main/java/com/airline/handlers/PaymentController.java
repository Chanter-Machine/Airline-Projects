package com.airline.handlers;

import com.airline.bean.Order;
import com.airline.bean.Passenger;
import com.airline.bean.Paymentrecord;
import com.airline.services.IPaymentService;
import com.airline.services.PaymentApproach.PayByAilipay;
import com.airline.services.PaymentApproach.PayByPayPal;
import com.airline.services.PaymentServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class PaymentController {
    private IPaymentService paymentService = new PaymentServiceImp();

    @RequestMapping("/pay.do")
    public void pay(HttpServletRequest request, HttpServletResponse response) {
        if ("paypal".equals(request.getParameter("payment_type"))) {
            paymentService.setPaymentApproach(new PayByPayPal());
        } else if ("alipay".equals(request.getParameter("payment_type"))) {
            paymentService.setPaymentApproach(new PayByAilipay());
        }
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
