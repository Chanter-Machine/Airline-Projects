package com.airline.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.airline.services.oberver.cancelflight.Observer;

public class FlightRecord {
    private Integer fligthrecord;

    private Integer flightid;

    private String status;

    private Date date;

    private String description;
    
    private List<Observer> list = new ArrayList<Observer>();

    public Integer getFligthrecord() {
        return fligthrecord;
    }

    public void setFligthrecord(Integer fligthrecord) {
        this.fligthrecord = fligthrecord;
    }

    public Integer getFlightid() {
        return flightid;
    }

    public void setFlightid(Integer flightid) {
        this.flightid = flightid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	@Override
	public String toString() {
		return "FlightRecord [fligthrecord=" + fligthrecord + ", flightid=" + flightid + ", status=" + status
				+ ", date=" + date + ", description=" + description + "]";
	}
	
	public void attach(Observer observer) {
		list.add(observer);
	}

	public void detach(Observer observer) {
		list.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : list) {
			observer.update(this);
		}
	}

    public void cancel(){
    	setStatus("canceled");
        notifyObservers();
    }
    
}