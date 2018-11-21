package com.airline.services.interceptors;

import java.util.Date;
import java.util.List;

import com.airline.bean.Flight;

public interface IPathFilter {
	public void filter(Date startDate, List<List<Flight>> path);
}
