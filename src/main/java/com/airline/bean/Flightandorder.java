package com.airline.bean;

public class Flightandorder {
    private Integer flightandorderid;

    private Integer flightid;

    private Integer orderid;

    private String seattype;

    private Integer seatnum;

    public Integer getFlightandorderid() {
        return flightandorderid;
    }

    public void setFlightandorderid(Integer flightandorderid) {
        this.flightandorderid = flightandorderid;
    }

    public Integer getFlightid() {
        return flightid;
    }

    public void setFlightid(Integer flightid) {
        this.flightid = flightid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getSeattype() {
        return seattype;
    }

    public void setSeattype(String seattype) {
        this.seattype = seattype == null ? null : seattype.trim();
    }

    public Integer getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(Integer seatnum) {
        this.seatnum = seatnum;
    }
}