package com.airline.bean;

public class Seatrecord {
    private Integer seatrecordid;

    private String flightid;

    private Integer availfirst;

    private Integer availbusiness;

    private Integer availeconomyl;

    public Integer getSeatrecordid() {
        return seatrecordid;
    }

    public void setSeatrecordid(Integer seatrecordid) {
        this.seatrecordid = seatrecordid;
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid == null ? null : flightid.trim();
    }

    public Integer getAvailfirst() {
        return availfirst;
    }

    public void setAvailfirst(Integer availfirst) {
        this.availfirst = availfirst;
    }

    public Integer getAvailbusiness() {
        return availbusiness;
    }

    public void setAvailbusiness(Integer availbusiness) {
        this.availbusiness = availbusiness;
    }

    public Integer getAvaileconomyl() {
        return availeconomyl;
    }

    public void setAvaileconomyl(Integer availeconomyl) {
        this.availeconomyl = availeconomyl;
    }
}