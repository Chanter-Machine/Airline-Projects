package com.airline.bean;

public class Continent {
    private Integer continentid;

    private String continentname;

    public Integer getContinentid() {
        return continentid;
    }

    public void setContinentid(Integer continentid) {
        this.continentid = continentid;
    }

    public String getContinentname() {
        return continentname;
    }

    public void setContinentname(String continentname) {
        this.continentname = continentname == null ? null : continentname.trim();
    }
}