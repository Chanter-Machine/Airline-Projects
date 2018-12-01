package com.airline.bean;

import java.util.Date;

public class Dealdate {
    private Integer rangeid;

    private Date minimumDate;

    private Date maximumDate;

    public Integer getRangeid() {
        return rangeid;
    }

    public void setRangeid(Integer rangeid) {
        this.rangeid = rangeid;
    }

    public Date getMinimumDate() {
        return minimumDate;
    }

    public void setMinimumDate(Date minimumDate) {
        this.minimumDate = minimumDate;
    }

    public Date getMaximumDate() {
        return maximumDate;
    }

    public void setMaximumDate(Date maximumDate) {
        this.maximumDate = maximumDate;
    }
}