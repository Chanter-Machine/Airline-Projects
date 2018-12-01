package com.airline.test;

import com.airline.bean.Paymentrecord;
import com.airline.services.payment.IPaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class PaymentTest {
    @Autowired
    IPaymentService paymentService;

    @Test
    public void testQueryPayment() {
        Paymentrecord paymentrecord = paymentService.queryPayment(1);
        System.out.println(paymentrecord.toString());
    }

}
