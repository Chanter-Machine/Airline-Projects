package com.airline.test;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Refund;
import com.paypal.api.payments.Sale;
import com.paypal.base.Constants;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import org.junit.Test;


public class TestPayPalRefund {

    @Test
    public void refund() {

        APIContext apiContext = new APIContext("ATIrHa1n8vg6QWMGiJrAsivsVhdhyg-nNiHzkyIowjdKd9lDiXEn_8EVa0O7NuVt-mxuK8yN47Zr1eew",
                "EKON4V2tn96Fd5krlSHPHY-cYmvK4-EazShEPnBxii4dxpkjp1CswKZ5E1spsU2OC_fQuYlFRui6VyP0",
                Constants.SANDBOX);

        // 1. set up a Refund object
        Refund refund = new Refund();
        Amount amount = new Amount();
        amount.setTotal("1.31");
        amount.setCurrency("EUR");
        refund.setAmount(amount);

        // 2. get sale with id
        Sale sale = new Sale();
        sale.setId("1KH25376R0966643J");

        try {
            sale.refund(apiContext, refund);
        } catch (PayPalRESTException e) {
            System.err.println(e.getDetails());
        }

    }


}
