package com.airline.services.payment.PaymentMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentMethodFactory {
    @Autowired
    @Qualifier("PayByPayPal")
    IPaymentMethod payByPayPal;
    @Autowired
    @Qualifier("PayByAlipay")
    IPaymentMethod payByAlipay;
    @Autowired
    @Qualifier("PayByCurrencyFair")
    IPaymentMethod payByCurrencyFair;

    public static final int ByPayPal = 1;
    public static final int ByAlipay = 2;
    public static final int ByCurrencyFair = 3;

    public IPaymentMethod getPaymentApproach(int payment) {
        switch (payment) {
            case ByAlipay:
                return payByAlipay;
            case ByPayPal:
                return payByPayPal;
            case ByCurrencyFair:
                return payByCurrencyFair;
        }
        return null;
    }
}
