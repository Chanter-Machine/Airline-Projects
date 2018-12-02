package com.airline.bean;

import java.util.Date;

public class Flight {
    private Integer flightid;

    private Integer ori;

    private Integer dst;

    private Integer planeid;

    private Date takeofftime;

    private Date arrivetime;

    private Integer price;
    
    private City oriCity;
    
    private City dstCity;

    public Integer getFlightid() {
        return flightid;
    }

    public void setFlightid(Integer flightid) {
        this.flightid = flightid;
    }

    public Integer getOri() {
        return ori;
    }

    public void setOri(Integer ori) {
        this.ori = ori;
    }

    public Integer getDst() {
        return dst;
    }

    public void setDst(Integer dst) {
        this.dst = dst;
    }

    public Integer getPlaneid() {
        return planeid;
    }

    public void setPlaneid(Integer planeid) {
        this.planeid = planeid;
    }

    public Date getTakeofftime() {
        return takeofftime;
    }

    public void setTakeofftime(Date takeofftime) {
        this.takeofftime = takeofftime;
    }

    public Date getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

	public City getOriCity() {
		return oriCity;
	}

	public void setOriCity(City oriCity) {
		this.oriCity = oriCity;
	}

	public City getDstCity() {
		return dstCity;
	}

	public void setDstCity(City dstCity) {
		this.dstCity = dstCity;
	}
    
    
}