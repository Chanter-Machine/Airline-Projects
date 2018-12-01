package com.airline.deals;

public class DealsPassenger implements DealObserver {

	private Subject subject;
	
	public Subject getSubject(){
		return subject;
	}
	
	public void setSubject(Subject subject){
		this.subject= subject;
	}

    @Override
	public void update(String dealName, String passengerName){
		System.out.println("Hello " + passengerName + ", " + dealName + " is now available");
	}

}
