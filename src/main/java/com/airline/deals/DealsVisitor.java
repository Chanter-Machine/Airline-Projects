package com.airline.deals;


import java.util.Date;
import com.airline.bean.Passenger;
import com.airline.bean.Deal;
import com.airline.bean.Dealtype;
import com.airline.bean.User;


public class DealsVisitor extends Passenger {


    private double discount;
    private Date dob;
    private long diff;
    private long age;

    private String password;

    Passenger passengerInfo;

    Deal deal;
    Dealtype dealtype;

    User userInfo;

    public void setDiscount(Passenger passenger){
        dob = passenger.getDob();
        diff = ((new Date()).getTime() - dob.getTime())/3153600;
        age = (int)(diff/10000);

        if ((age>=dealtype.getMinage()) && (age<=dealtype.getMaxage()))
        {
            discount = deal.getDiscount();
        }

    }

    public double getDiscount() { return discount; }


}

