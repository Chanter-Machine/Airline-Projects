package com.airline.bean;

public class City {
    private Integer cityid;

    private String cityname;

    private String airportcode;

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getAirportcode() {
        return airportcode;
    }

    public void setAirportcode(String airportcode) {
        this.airportcode = airportcode == null ? null : airportcode.trim();
    }
}