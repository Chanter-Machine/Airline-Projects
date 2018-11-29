package com.airline.services.decorator.PriceDecorator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SeatClassFactory {
	
	@Autowired
	@Qualifier("businessClassPrice")
	IFlightPrice businessClassPrice;
	
	@Autowired
	@Qualifier("firstClassPrice")
	IFlightPrice firstClassPrice;
	
	@Autowired
	@Qualifier("economyClassPrice")
	IFlightPrice economyClassPrice;
	
	public IFlightPrice getFlightPrice(String classRequirement) {
		if(classRequirement.equals("economy")) {
			return economyClassPrice;
		}
		else if(classRequirement.equals("first")) {
			return firstClassPrice;
		}
		else if(classRequirement.equals("business")){
			return businessClassPrice;
		}
		return economyClassPrice;
	}
	
	public IFlightPrice getFlightPrice() {
		return economyClassPrice;
	}
}
