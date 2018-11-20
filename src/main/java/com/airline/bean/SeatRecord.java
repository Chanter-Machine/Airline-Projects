package com.airline.bean;

import java.util.Date;

public class SeatRecord {
    private Integer seatrecordid;

    private String flightid;

    private Integer bookedfirst;

    private Integer bookedbusiness;

    private Integer bookedeconomic;

    private Date date;

    private Integer planeid;
    
    private Plane plane;

    public Integer getSeatrecordid() {
        return seatrecordid;
    }

    public void setSeatrecordid(Integer seatrecordid) {
        this.seatrecordid = seatrecordid;
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid == null ? null : flightid.trim();
    }

    public Integer getBookedfirst() {
        return bookedfirst;
    }

    public void setBookedfirst(Integer bookedfirst) {
        this.bookedfirst = bookedfirst;
    }

    public Integer getBookedbusiness() {
        return bookedbusiness;
    }

    public void setBookedbusiness(Integer bookedbusiness) {
        this.bookedbusiness = bookedbusiness;
    }

    public Integer getBookedeconomic() {
        return bookedeconomic;
    }

    public void setBookedeconomic(Integer bookedeconomic) {
        this.bookedeconomic = bookedeconomic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPlaneid() {
        return planeid;
    }

    public void setPlaneid(Integer planeid) {
        this.planeid = planeid;
    }

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	
}