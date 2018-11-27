package com.airline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PriceCollection {
	List<Integer> priceList = new ArrayList<Integer>();

	public List<Integer> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<Integer> priceList) {
		this.priceList = priceList;
	}
	
	
}
