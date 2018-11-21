package com.airline.services.interceptors;

import java.util.Date;
import java.util.List;

import com.airline.bean.Flight;

public class Path {
	PathFilterManager pathFilterManager;
	List<List<Flight>> path;
	Date startDate;
	
	public List<List<Flight>> getPath() {
		return path;
	}

	public void setPath(List<List<Flight>> path) {
		this.path = path;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setPathFilterManager(PathFilterManager pathFilterManager) {
		this.pathFilterManager = pathFilterManager;
	}
	
	public void doFilter(Date startDate, List<List<Flight>> path){
		pathFilterManager.filterRequest(startDate, path);
	   }
}
