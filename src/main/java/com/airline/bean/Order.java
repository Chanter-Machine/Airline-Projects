package com.airline.bean;

public class Order {
    private Integer orderid;

    private Integer passagerid;

    private Integer paymentid;

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
}