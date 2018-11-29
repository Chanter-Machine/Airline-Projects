package com.airline.services.decorator.PriceDecorator;

public abstract class PriceDecorator implements IFlightPrice {
	
	private IFlightPrice flightPrice;
	Integer basicPrice;
	
	public PriceDecorator(IFlightPrice flightPrice) {
		this.flightPrice = flightPrice;
	}
	
	@Override
	public int getPrice() {
		
		return flightPrice.getPrice();
	}

	public void setPrice(int price) {}
}
