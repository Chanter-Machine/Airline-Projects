package com.airline.test;

import com.airline.bean.Paymentrecord;
import com.airline.dao.PaymentrecordMapper;
import com.paypal.api.payments.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class RollbackTxTest {

    @Autowired
    private PaymentrecordMapper paymentrecordMapper;

    @Test
    @Transactional
    public void test() {
        Paymentrecord paymentrecord = paymentrecordMapper.selectByPrimaryKey(133);
        paymentrecord.setStatus(Paymentrecord.PendingStatus);
        paymentrecord.setStatus(Paymentrecord.PaidStatus);
        paymentrecordMapper.updateByPrimaryKeySelective(paymentrecord);
    }


}
