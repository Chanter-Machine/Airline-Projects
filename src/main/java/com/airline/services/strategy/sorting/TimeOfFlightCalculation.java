package com.airline.services.strategy.sorting;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;

import com.airline.bean.Flight;

public class TimeOfFlightCalculation implements Callable<Integer>{
	private List<Flight> list;
	
	public void setList(List<Flight> list) {
		this.list = list;
	}
	
	public TimeOfFlightCalculation(List<Flight> list) {
		this.list = list;
	}

	private Integer calculateTImeOfFlight() {
		int sum = 0;
		for (Flight flight : list) {
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();		
			Calendar c3 = Calendar.getInstance();
			c1.setTime(flight.getTakeofftime());
			c2.setTime(flight.getArrivetime());
			c3.set(1970, 0, 1, 23, 59);
			long i =0;
			if(flight.getTakeofftime().after(flight.getArrivetime())) {
				i = c2.getTimeInMillis()+c3.getTimeInMillis()-c1.getTimeInMillis();
			}
			else {
				i = c2.getTimeInMillis() - c1.getTimeInMillis();
			}
			long result = i / (1000 * 60);
			sum += result;
//			System.out.println(result);
		}
		return sum;
	}
	
	@Override
	public Integer call() throws Exception {
		return calculateTImeOfFlight();
	}

}
