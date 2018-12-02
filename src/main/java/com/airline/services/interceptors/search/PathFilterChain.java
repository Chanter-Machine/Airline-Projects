package com.airline.services.interceptors.search;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
import com.airline.services.PathCollection;
@Component
public class PathFilterChain {
	private List<IPathFilter> filters = new ArrayList<IPathFilter>();
	private Target target;
	
	public void addFilter(IPathFilter filter){
	      filters.add(filter);
	   }
	 
	public void execute(PathCollection pathCollection){
		
		for (IPathFilter filter : filters) {
			filter.pathFilter(pathCollection);
		}
//		System.out.println(path);
	    target.execute(pathCollection);
	}
	 
	   public void setTarget(Target target){
	      this.target = target;
	   }
}
