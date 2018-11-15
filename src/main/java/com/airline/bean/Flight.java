package com.airline.bean;

import java.util.Date;

public class Flight {
    private Integer flightid;

    private Integer dst;

    private Integer ori;

    private Integer planeid;

    private Date date;

    private Integer price;

    public Integer getFlightid() {
        return flightid;
    }

    public void setFlightid(Integer flightid) {
        this.flightid = flightid;
    }

    public Integer getDst() {
        return dst;
    }

    public void setDst(Integer dst) {
        this.dst = dst;
    }

    public Integer getOri() {
        return ori;
    }

    public void setOri(Integer ori) {
        this.ori = ori;
    }

    public Integer getPlaneid() {
        return planeid;
    }

    public void setPlaneid(Integer planeid) {
        this.planeid = planeid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}