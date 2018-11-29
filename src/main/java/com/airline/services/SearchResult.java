package com.airline.services;

import org.springframework.stereotype.Component;

@Component
public class SearchResult {
	PathCollection pathCollection;
	PriceCollection priceCollection;
	public PathCollection getPathCollection() {
		return pathCollection;
	}
	public void setPathCollection(PathCollection pathCollection) {
		this.pathCollection = pathCollection;
	}
	public PriceCollection getPriceCollection() {
		return priceCollection;
	}
	public void setPriceCollection(PriceCollection priceCollection) {
		this.priceCollection = priceCollection;
	}
	
	
}
