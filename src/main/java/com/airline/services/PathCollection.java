package com.airline.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.airline.bean.Flight;

@Component
public class PathCollection {
	List<List<Flight>> pathList;
	Date takeoffDate;

	public Date getTakeoffDate() {
		return takeoffDate;
	}

	public void setTakeoffDate(Date takeoffDate) {
		this.takeoffDate = takeoffDate;
	}

	public List<List<Flight>> getPathList() {
		return pathList;
	}

	public void setPathList(List<List<Flight>> pathList) {
		this.pathList = pathList;
	}

}
