package com.airline.bean;

public class PaymentType {
    private Integer paymenttypeid;

    private String paymenttypename;

    public Integer getPaymenttypeid() {
        return paymenttypeid;
    }

    public void setPaymenttypeid(Integer paymenttypeid) {
        this.paymenttypeid = paymenttypeid;
    }

    public String getPaymenttypename() {
        return paymenttypename;
    }

    public void setPaymenttypename(String paymenttypename) {
        this.paymenttypename = paymenttypename == null ? null : paymenttypename.trim();
    }
}