package com.airline.services.interceptors.search;

import java.util.List;

import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
import com.airline.services.PathCollection;
import com.airline.services.strategy.sorting.ISorting;

@Component
public class Target {

	ISorting sortingObject;
	List<List<Flight>> sortedPath;

	public void execute(PathCollection pathCollection) {
//		sortedPath = sortingObject.sort(pathCollection.getTakeoffDate(), pathCollection.getPathList());
		pathCollection.setPathList(sortingObject.sort(pathCollection.getTakeoffDate(), pathCollection.getPathList()));
	}

	public void getSortingObject(ISorting sortingObject) {
		this.sortingObject = sortingObject;
	}

	public List<List<Flight>> getSortedPath() {
		return sortedPath;
	}

}
