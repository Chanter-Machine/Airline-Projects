package com.airline.services.strategy.sorting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortingFactory{
	
	@Autowired
	@Qualifier("sortByAmount")
	ISorting sortByAmount;
	
	@Autowired
	@Qualifier("sortByTimeOfFlight")
	ISorting sortByTimeOfFlight;
	
	@Autowired
	@Qualifier("sortByWaitingHours")
	ISorting sortByWaitingHours;
//	
	public ISorting getSortingObject(String requirement) {
		if(requirement.equals("1")) {
			return sortByAmount;
		}
		else if(requirement.equals("2")) {
			return sortByTimeOfFlight;
		}
		else if(requirement.equals("3")) {
			return sortByWaitingHours;
		}
		return null;
	}
	
}
