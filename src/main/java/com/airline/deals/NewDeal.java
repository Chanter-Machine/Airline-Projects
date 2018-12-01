package com.airline.deals;

import java.util.ArrayList;
import java.util.List;

public class NewDeal implements Subject {
	
	private String dealName;
    List<String> passengerEmail;

	private boolean available;
	
	private List<DealObserver> listOfDealObservers = new ArrayList<DealObserver>();

	public boolean isAvailable(){
		return available;
	}
	
	public int setAvailable(boolean available){
		int notifiedPassengers=0;
		this.available = available;
		if(available == true){
			notifiedPassengers = notifyObservers();
		}
		return  notifiedPassengers;
	}
	
	public String getDealName(){
		return dealName;
	}

    public void setPassengerEmail(List<String> listOfemail){
        this.passengerEmail = listOfemail;
    }
	
	public void setDealName(String dealName){
		this.dealName = dealName;
	}
	
	public List<DealObserver> getListOfDealObservers() {
		return listOfDealObservers;
	}
	
	public void setListOfDealObservers(List<DealObserver> listOfDealObservers) {
		this.listOfDealObservers = listOfDealObservers;
	}
	
	
	
	@Override
	public void registerObserver(DealObserver dealObserver) {
		// TODO Auto-generated method stub
		listOfDealObservers.add(dealObserver);
	}

	@Override
	public void removeObserver(DealObserver dealObserver) {
		// TODO Auto-generated method stub
		listOfDealObservers.remove(dealObserver);
	}

	@Override
	public int notifyObservers() {
		// TODO Auto-generated method stub
		
		//System.out.println("Notifying " + listOfDealObservers.size() + " registered passengers that there is a new Deal");
		
		for(DealObserver dealObserver : listOfDealObservers){

            for(String themail : passengerEmail) {
                dealObserver.update(dealName, themail);
            }
		}

		return listOfDealObservers.size();
		
	}
	
	

}
