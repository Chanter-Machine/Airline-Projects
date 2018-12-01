package com.airline.bean;

public class Deal {
    private Integer dealid;

    private String description;

    private Double discount;

    private Integer typeid;

    public Integer getDealid() {
        return dealid;
    }

    public void setDealid(Integer dealid) {
        this.dealid = dealid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}