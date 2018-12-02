package com.airline.deals;

public interface Subject {
	
	public void registerObserver(DealObserver dealObserver);
	public void removeObserver(DealObserver dealObserver);
	public int notifyObservers();

}
