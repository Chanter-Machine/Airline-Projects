package com.airline.test;

import com.airline.bean.Paymentrecord;
import com.airline.dao.PaymentrecordMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class PaymentrecordTest {

    @Autowired
    private PaymentrecordMapper paymentrecordMapper;

    @Test
    public void test01() {
        Paymentrecord paymentrecord = new Paymentrecord();
        paymentrecord.setDate(new Date());
        paymentrecordMapper.insert(paymentrecord);
    }
}
