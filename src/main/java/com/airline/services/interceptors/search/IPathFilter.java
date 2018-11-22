package com.airline.services.interceptors.search;

import java.util.Date;
import java.util.List;

import com.airline.bean.Flight;

public interface IPathFilter {
	public List<List<Flight>> pathFilter(Date takeoffDate, List<List<Flight>> path);
}
