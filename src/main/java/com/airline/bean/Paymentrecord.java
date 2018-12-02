package com.airline.bean;

import java.util.Date;

public class Paymentrecord {
    public static final String PendingStatus = "Pending";
    public static final String PaidStatus = "Paid";
    public static final String RefundStatus = "Refund";
    private Integer paymentid;

    private String amount;

    private String status;

    private Date date;

    private Integer paymenttype;

    private String thirtypartypaymentid;

    public Integer getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(Integer paymentid) {
        this.paymentid = paymentid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(Integer paymenttype) {
        this.paymenttype = paymenttype;
    }

    public String getThirtypartypaymentid() {
        return thirtypartypaymentid;
    }

    public void setThirtypartypaymentid(String thirtypartypaymentid) {
        this.thirtypartypaymentid = thirtypartypaymentid == null ? null : thirtypartypaymentid.trim();
    }
}