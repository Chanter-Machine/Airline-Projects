package com.airline.services.interceptors;

import java.util.Date;
import java.util.List;

import com.airline.bean.Flight;

public class PathFilterManager {
	PathFilterChain filterChain;
	 
	public PathFilterManager(Target target){
		filterChain = new PathFilterChain();
		filterChain.setTarget(target);
	}
	public void setFilter(IPathFilter filter){
		filterChain.addFilter(filter);
	}
 
	public void filterRequest(Date startDate, List<List<Flight>> path){
		filterChain.execute(startDate, path);
	}
}
