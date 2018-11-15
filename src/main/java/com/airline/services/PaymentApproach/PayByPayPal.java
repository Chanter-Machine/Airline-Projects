package com.airline.services.PaymentApproach;

public class PayByPayPal implements IPaymentApproach {

    public boolean pay() {
        return false;
    }

    public boolean refund() {
        return false;
    }
}
