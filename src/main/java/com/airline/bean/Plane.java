package com.airline.bean;

public class Plane {
    private Integer planeid;

    private String manufacturer;

    private Integer numoffirstclass;

    private Integer numofbusinessclass;

    private Integer numofeconomyclass;

    public Integer getPlaneid() {
        return planeid;
    }

    public void setPlaneid(Integer planeid) {
        this.planeid = planeid;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public Integer getNumoffirstclass() {
        return numoffirstclass;
    }

    public void setNumoffirstclass(Integer numoffirstclass) {
        this.numoffirstclass = numoffirstclass;
    }

    public Integer getNumofbusinessclass() {
        return numofbusinessclass;
    }

    public void setNumofbusinessclass(Integer numofbusinessclass) {
        this.numofbusinessclass = numofbusinessclass;
    }

    public Integer getNumofeconomyclass() {
        return numofeconomyclass;
    }

    public void setNumofeconomyclass(Integer numofeconomyclass) {
        this.numofeconomyclass = numofeconomyclass;
    }
}