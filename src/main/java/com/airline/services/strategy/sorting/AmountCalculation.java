package com.airline.services.strategy.sorting;

import java.util.List;
import java.util.concurrent.Callable;

import com.airline.bean.Flight;

public class AmountCalculation implements Callable<Integer> {

	private List<Flight> list;

	public int calculateAmount() {
		int sum = 0;
		for (Flight flight : list) {
			sum += flight.getPrice();
		}
		return sum;
	}

	public void setList(List<Flight> list) {
		this.list = list;
	}
	
	public AmountCalculation(List<Flight> list) {
		super();
		this.list = list;
	}

	@Override
	public Integer call() throws Exception {
		return calculateAmount();
	}

}
