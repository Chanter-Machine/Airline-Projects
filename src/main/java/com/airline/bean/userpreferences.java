package com.airline.bean;

import java.math.BigDecimal;

public class userpreferences {
    private Integer preferenceid;

    private Integer userid;

    private String seatingclass;

    private String seatpreference;

    private Integer wifiavailable;

    private Integer airportpickup;

    private Integer accomodationsuggestions;

    private BigDecimal budgetlimit;

    public Integer getPreferenceid() {
        return preferenceid;
    }

    public void setPreferenceid(Integer preferenceid) {
        this.preferenceid = preferenceid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSeatingclass() {
        return seatingclass;
    }

    public void setSeatingclass(String seatingclass) {
        this.seatingclass = seatingclass == null ? null : seatingclass.trim();
    }

    public String getSeatpreference() {
        return seatpreference;
    }

    public void setSeatpreference(String seatpreference) {
        this.seatpreference = seatpreference == null ? null : seatpreference.trim();
    }

    public Integer getWifiavailable() {
        return wifiavailable;
    }

    public void setWifiavailable(Integer wifiavailable) {
        this.wifiavailable = wifiavailable;
    }

    public Integer getAirportpickup() {
        return airportpickup;
    }

    public void setAirportpickup(Integer airportpickup) {
        this.airportpickup = airportpickup;
    }

    public Integer getAccomodationsuggestions() {
        return accomodationsuggestions;
    }

    public void setAccomodationsuggestions(Integer accomodationsuggestions) {
        this.accomodationsuggestions = accomodationsuggestions;
    }

    public BigDecimal getBudgetlimit() {
        return budgetlimit;
    }

    public void setBudgetlimit(BigDecimal budgetlimit) {
        this.budgetlimit = budgetlimit;
    }
}