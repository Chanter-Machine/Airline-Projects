/**
 * 
 */
package com.airline.services.decorator.PriceDecorator;

/**
 * @author Chaofan
 * A concrete decorator for price of ticket.
 */
public class InsuranceDecorator extends PriceDecorator{
	public InsuranceDecorator(IFlightPrice flightPrice) {
		super(flightPrice);
	}

	public int getPrice() {
		System.out.println("insurance "+super.getPrice());
		return super.getPrice()+50;
	}
}
