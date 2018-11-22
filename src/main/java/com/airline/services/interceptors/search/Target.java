package com.airline.services.interceptors.search;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
import com.airline.services.strategy.sorting.ISorting;

@Component
public class Target {

	ISorting sortingObject;
	List<List<Flight>> sortedPath;

	public void execute(Date takeoffDate, List<List<Flight>> path) {
		sortedPath = sortingObject.sort(takeoffDate, path);
	}

	public void getSortingObject(ISorting sortingObject) {
		this.sortingObject = sortingObject;
	}

	public List<List<Flight>> getSortedPath() {
		return sortedPath;
	}

}
