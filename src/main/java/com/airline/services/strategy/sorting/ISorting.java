package com.airline.services.strategy.sorting;

import java.util.Date;
import java.util.List;

import com.airline.bean.Flight;

public interface ISorting {
	public List<List<Flight>> sort(Date takeoffDate, List<List<Flight>> path);
}
