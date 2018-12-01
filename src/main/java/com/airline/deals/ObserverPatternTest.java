package com.airline.deals;

public class ObserverPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DealsPassenger dealsPassenger1 = new DealsPassenger();
		//dealsPassenger1.setCustomerName("Christian");
		
		DealsPassenger dealsPassenger2 = new DealsPassenger();
		//dealsPassenger2.setCustomerName("Mirka");
		
		DealsPassenger dealsPassenger3 = new DealsPassenger();
		//dealsPassenger3.setCustomerName("Araora");
		
		DealsPassenger dealsPassenger4 = new DealsPassenger();
		//dealsPassenger4.setCustomerName("Arthur");
		
		NewDeal studentDeal = new NewDeal();
		studentDeal.setDealName("Special Deal for students");
		studentDeal.setAvailable(false);
		
		studentDeal.registerObserver(dealsPassenger1);
		studentDeal.registerObserver(dealsPassenger2);
		
		NewDeal christmasDeal = new NewDeal();
		christmasDeal.setDealName("Special Deal for christmas");
		christmasDeal.setAvailable(false);
		
		christmasDeal.registerObserver(dealsPassenger1);
		christmasDeal.registerObserver(dealsPassenger3);
		christmasDeal.registerObserver(dealsPassenger4);
		
		//After few days Deal becomes available.
		
		studentDeal.setAvailable(true);
		christmasDeal.setAvailable(true);

	}

}
