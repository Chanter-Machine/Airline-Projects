package com.airline.bean;

public class Plane {
    private Integer planeid;

    private String manufacturer;

    private String model;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
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

	@Override
	public String toString() {
		return "Plane [planeid=" + planeid + ", manufacturer=" + manufacturer + ", model=" + model
				+ ", numoffirstclass=" + numoffirstclass + ", numofbusinessclass=" + numofbusinessclass
				+ ", numofeconomyclass=" + numofeconomyclass + "]";
	}
    
}