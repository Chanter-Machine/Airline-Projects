package com.airline.services.interceptors.search;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
import com.airline.services.PathCollection;
@Component
public class PathFilterManager {
	@Autowired
	PathFilterChain pathFilterChain;
	 
	public PathFilterManager(Target target){
//		pathFilterChain = new FilterChain();
		pathFilterChain.setTarget(target);
	}
	
	public PathFilterManager() {}
	
	public void setTarget(Target target) {
		pathFilterChain.setTarget(target);
	}
	
	public void setFilter(IPathFilter filter){
		pathFilterChain.addFilter(filter);
	}
 
	public void filterRequest(PathCollection pathCollection){
		pathFilterChain.execute(pathCollection);
	}
}
