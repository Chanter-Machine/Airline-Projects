package com.airline.services.decorator.PriceDecorator;

import org.springframework.stereotype.Component;

@Component("firstClassPrice")
public class FirstClassPrice implements IFlightPrice {

	Integer basicPrice;
	
	@Override
	public int getPrice() {
		return basicPrice;
	}

	@Override
	public void setPrice(int price) {
		basicPrice = price*2;
	}

}
