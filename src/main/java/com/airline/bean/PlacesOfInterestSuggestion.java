package com.airline.bean;

public class PlacesOfInterestSuggestion {
    private Integer placesofinterestsuggestionid;

    private Integer continentid;

    private Integer placesofinterestcategoryid;

    private String placesofinterestsuggestionname;

    public Integer getPlacesofinterestsuggestionid() {
        return placesofinterestsuggestionid;
    }

    public void setPlacesofinterestsuggestionid(Integer placesofinterestsuggestionid) {
        this.placesofinterestsuggestionid = placesofinterestsuggestionid;
    }

    public Integer getContinentid() {
        return continentid;
    }

    public void setContinentid(Integer continentid) {
        this.continentid = continentid;
    }

    public Integer getPlacesofinterestcategoryid() {
        return placesofinterestcategoryid;
    }

    public void setPlacesofinterestcategoryid(Integer placesofinterestcategoryid) {
        this.placesofinterestcategoryid = placesofinterestcategoryid;
    }

    public String getPlacesofinterestsuggestionname() {
        return placesofinterestsuggestionname;
    }

    public void setPlacesofinterestsuggestionname(String placesofinterestsuggestionname) {
        this.placesofinterestsuggestionname = placesofinterestsuggestionname == null ? null : placesofinterestsuggestionname.trim();
    }
}