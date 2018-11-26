package com.airline.services.decorator.PriceDecorator;


/**
 * @author Chaofan
 * A concrete decorator for price of ticket.
 */
public class TaxDecorator extends PriceDecorator{

	public TaxDecorator(IFlightPrice flightPrice) {
		super(flightPrice);
	}

	public int getPrice() {
		System.out.println("tax "+super.getPrice());
		return (int) (super.getPrice()*1.15);
	}
	
}
