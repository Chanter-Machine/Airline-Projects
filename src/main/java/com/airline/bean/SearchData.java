package com.airline.bean;

import java.util.Date;

public class SearchData {
	private String options;
	private int origin;
	private int destination;
	private Date traveldate;
	private String seat;
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public int getOrigin() {
		return origin;
	}
	public void setOrigin(int origin) {
		this.origin = origin;
	}
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}
	public Date getTraveldate() {
		return traveldate;
	}
	public void setTraveldate(Date traveldate) {
		this.traveldate = traveldate;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "SearchData [options=" + options + ", origin=" + origin + ", destination=" + destination
				+ ", traveldate=" + traveldate + ", seat=" + seat + "]";
	}
	
	
}
