package com.airline.services.interceptors.search;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
import com.airline.services.PathCollection;
import com.airline.services.strategy.sorting.SortingFactory;

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

	@Autowired
	Target target;

	@Autowired
	SortingFactory sortingFactory;

//	public void setFilterManager(FilterManager filterManager){
//		pathFilterManager = filterManager;
//	}

	public void doFilter(PathCollection pathCollection, String sortingRequirement) {
		pathFilterManager.setTarget(target);
		pathFilterManager.setFilter(flightRecordFilter);
		pathFilterManager.setFilter(seatRecordFilter);
		target.getSortingObject(sortingFactory.getSortingObject(sortingRequirement));
		pathFilterManager.filterRequest(pathCollection);
	}

	public PathFilterManager getPathFilterManager() {
		return pathFilterManager;
	}

	public void setPathFilterManager(PathFilterManager pathFilterManager) {
		this.pathFilterManager = pathFilterManager;
	}

	public Target getTarget() {
		return target;
	}

}
