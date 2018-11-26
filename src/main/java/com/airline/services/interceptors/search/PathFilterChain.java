package com.airline.services.interceptors.search;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
@Component
public class PathFilterChain {
	private List<IPathFilter> filters = new ArrayList<IPathFilter>();
	private Target target;
	
	public void addFilter(IPathFilter filter){
	      filters.add(filter);
	   }
	 
	public void execute(Date takeoffDate, List<List<Flight>> path){
		
		for (IPathFilter filter : filters) {
			path = filter.pathFilter(takeoffDate, path);
		}
//		System.out.println(path);
	    target.execute(takeoffDate, path);
	}
	 
	   public void setTarget(Target target){
	      this.target = target;
	   }
}
