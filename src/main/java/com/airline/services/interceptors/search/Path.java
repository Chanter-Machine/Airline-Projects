package com.airline.services.interceptors.search;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
@Component
public class Path {
	@Autowired
	PathFilterManager pathFilterManager;
	
	@Autowired
	@Qualifier("seatRecordFilter")
	IPathFilter seatRecordFilter;
	
	@Autowired
	@Qualifier("flightRecordFilter")
	IPathFilter flightRecordFilter;
	
//	public void setFilterManager(FilterManager filterManager){
//		pathFilterManager = filterManager;
//	}
 
	public void doFilter(Date takeoffDate, List<List<Flight>> path){
		pathFilterManager.setFilter(flightRecordFilter);
		pathFilterManager.setFilter(seatRecordFilter);
		pathFilterManager.filterRequest(takeoffDate, path);
	}

	public PathFilterManager getPathFilterManager() {
		return pathFilterManager;
	}

	public void setPathFilterManager(PathFilterManager pathFilterManager) {
		this.pathFilterManager = pathFilterManager;
	}
	
	
}
