package com.airline.bean;

import java.util.Date;

public class FlightRecord {
    private Integer fligthrecord;

    private Integer flightid;

    private String status;

    private Date date;

    private String description;

    public Integer getFligthrecord() {
        return fligthrecord;
    }

    public void setFligthrecord(Integer fligthrecord) {
        this.fligthrecord = fligthrecord;
    }

    public Integer getFlightid() {
        return flightid;
    }

    public void setFlightid(Integer flightid) {
        this.flightid = flightid;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}