package com.airline.services.strategy.sorting;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
@Component("sortByWaitingHours")
public class SortByWaitingHours implements ISorting {

	public List<List<Flight>> sort(Date takeoffDate, List<List<Flight>> path) {
		// TODO Auto-generated method stub
		return null;
	}

}
