package com.airline.services.interceptors;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.airline.bean.Flight;

public class PathFilterChain {
	 private List<IPathFilter> filters = new ArrayList<IPathFilter>();
	   private Target target;
	 
	   public void addFilter(IPathFilter filter){
	      filters.add(filter);
	   }
	 
	   public void execute(Date startDate, List<List<Flight>> path){
	      for (IPathFilter filter : filters) {
	         filter.filter(startDate, path);
	      }
	      target.sorting("");
	   }
	 
	   public void setTarget(Target target){
	      this.target = target;
	   }
}
