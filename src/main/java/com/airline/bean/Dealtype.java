package com.airline.bean;

import java.util.Date;

public class Dealtype {
    private Integer typeid;

    private String type;

    private Integer minage;

    private Integer maxage;

    private Date mindate;

    private Date maxdate;

    private Integer rangetypecode;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getMinage() {
        return minage;
    }

    public void setMinage(Integer minage) {
        this.minage = minage;
    }

    public Integer getMaxage() {
        return maxage;
    }

    public void setMaxage(Integer maxage) {
        this.maxage = maxage;
    }

    public Date getMindate() {
        return mindate;
    }

    public void setMindate(Date mindate) {
        this.mindate = mindate;
    }

    public Date getMaxdate() {
        return maxdate;
    }

    public void setMaxdate(Date maxdate) {
        this.maxdate = maxdate;
    }

    public Integer getRangetypecode() {
        return rangetypecode;
    }

    public void setRangetypecode(Integer rangetypecode) {
        this.rangetypecode = rangetypecode;
    }
}