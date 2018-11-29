package com.airline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PriceCollection {
	List<Integer> priceList = new ArrayList<Integer>();
	List<Integer> taxList = new ArrayList<Integer>();
	List<Integer> insuranceList = new ArrayList<Integer>();

	public List<Integer> getPriceList() {
		return priceList;
	}
	public void setPriceList(List<Integer> priceList) {
		this.priceList = priceList;
	}

	public List<Integer> getTaxList() {
		return taxList;
	}

	public void setTaxList(List<Integer> taxList) {
		this.taxList = taxList;
	}

	public List<Integer> getInsuranceList() {
		return insuranceList;
	}

	public void setInsuranceList(List<Integer> insuranceList) {
		this.insuranceList = insuranceList;
	}
	public void cleanData() {
		priceList = new ArrayList<Integer>();
		taxList = new ArrayList<Integer>();
		insuranceList = new ArrayList<Integer>();
	}
	
}
