package com.airline.bean;

import java.util.Date;

public class Order {
    public static final String PendingStatus = "Pending";
    public static final String PaidStatus = "Paid";
    public static final String CancelledByPassengerStatus = "CancelledByPassenger";
    public static final String CancelledByAirlineStatus = "CancelledByAirline";
    public static final String CompletedStatus = "Completed";
    private Integer orderid;

    private Integer passagerid;

    private Integer paymentid;

    private String status;

    private Date date;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getPassagerid() {
        return passagerid;
    }

    public void setPassagerid(Integer passagerid) {
        this.passagerid = passagerid;
    }

    public Integer getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(Integer paymentid) {
        this.paymentid = paymentid;
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
}