package com.airline.services.interceptors.search;

import java.util.Date;
import java.util.List;

import com.airline.bean.Flight;
import com.airline.services.PathCollection;

public interface IPathFilter {
	public List<List<Flight>> pathFilter(PathCollection pathCollection);
}
