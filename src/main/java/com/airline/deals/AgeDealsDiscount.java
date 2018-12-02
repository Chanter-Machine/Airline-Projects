package com.airline.deals;

import com.airline.bean.Passenger;

import java.util.Date;

public class AgeDealsDiscount implements  VisitableDeals{
    private Date age;
    Passenger passenger;
    //accept the visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Date getAge() {
        return passenger.getDob();
    }

}
