package com.airline.deals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.airline.bean.Deal;
import com.airline.bean.Passenger;

public class RunDealsVisit {
    //normal shopping cart stuff
    private ArrayList<VisitableDeals> items=new ArrayList<VisitableDeals>();
    private Passenger passenger;
    List<Deal> deals;

    public void setData(Passenger passenger, List<Deal> deals){this.passenger = passenger;this.deals=deals;}

    public double calculatePostage() {

        AgeDealsDiscount add = new AgeDealsDiscount();
        DateDealsDiscount ddd = new DateDealsDiscount();

        add.setPassenger(passenger);
        ddd.setDate(new Date());
        items.add(add);
        items.add(ddd);
        //create a visitor
        PassengerVisitor visitor = new PassengerVisitor();
        visitor.setListofDeals(deals);
        //iterate through all items
        for(VisitableDeals item: items) {
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostage();
        return postage;
    }
}
