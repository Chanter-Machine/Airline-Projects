package com.airline.bean;

public class PlacesOfInterestCategory {
    private Integer placesofinterestcategoryid;

    private String placesofinterestcategoryname;

    public Integer getPlacesofinterestcategoryid() {
        return placesofinterestcategoryid;
    }

    public void setPlacesofinterestcategoryid(Integer placesofinterestcategoryid) {
        this.placesofinterestcategoryid = placesofinterestcategoryid;
    }

    public String getPlacesofinterestcategoryname() {
        return placesofinterestcategoryname;
    }

    public void setPlacesofinterestcategoryname(String placesofinterestcategoryname) {
        this.placesofinterestcategoryname = placesofinterestcategoryname == null ? null : placesofinterestcategoryname.trim();
    }
}