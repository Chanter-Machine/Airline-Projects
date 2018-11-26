package com.airline.services.decorator.PriceDecorator;

import org.springframework.stereotype.Component;

@Component("economyClassPrice")
public class EconomyClassPrice implements IFlightPrice {

	Integer basicPrice;
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrice(int price) {
		basicPrice = price;
	}
}
