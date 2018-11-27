package com.airline.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
@Component
public class PathCollection {
	List<List<Flight>> pathList;

	public List<List<Flight>> getPathList() {
		return pathList;
	}

	public void setPathList(List<List<Flight>> pathList) {
		this.pathList = pathList;
	}
	
	
}
