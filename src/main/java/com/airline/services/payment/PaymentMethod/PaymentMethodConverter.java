package com.airline.services.payment.PaymentMethod;

import org.springframework.core.convert.converter.Converter;

public class PaymentMethodConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        if ("paypal".equals(source)) {
            return PaymentMethodFactory.ByPayPal;
        } else if ("alipay".equals(source)) {
            return PaymentMethodFactory.ByAlipay;
        } else if ("currencyfair".equals(source)) {
            return PaymentMethodFactory.ByCurrencyFair;
        }
        return null;
    }
}
