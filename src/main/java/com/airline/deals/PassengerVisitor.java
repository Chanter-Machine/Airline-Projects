package com.airline.deals;

import com.airline.bean.Dealtype;
import com.airline.bean.Deal;
import com.airline.services.IDealService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class PassengerVisitor implements Visitor {


    private double discount=0.00;
    private Date dob;
    private long diff;
    private long age;
    Dealtype dealtype;
    List<Deal> listofDeals;

    public void setListofDeals(List<Deal> listofDeals){
        this.listofDeals = listofDeals;
    }

    //collect data about the book
    public void visit(AgeDealsDiscount ageDealsDiscount) {
        //assume we have a calculation here related to weight and price
        //free postage for a book over 10

        dob = ageDealsDiscount.getAge();
        diff = ((new Date()).getTime() - dob.getTime())/3153600;
        age = (int)(diff/10000);
        /*for (Deal deal: listofDeals){
            if ((deal.getRangetypecode()==1) && (deal.getMaxage()>=age) && (age>deal.getMinage())) {
                discount+=deal.getDiscount();
                System.out.println(deal.getDiscount());
            }
        }
        System.out.println(discount);*/
        discount += listofDeals.stream().filter(o->o.getRangetypecode()==1 && o.getMaxage()>=age && age>=o.getMinage()).mapToDouble(o->o.getDiscount()).sum();

    }

    public void visit(DateDealsDiscount dateDealsDiscount){
        discount += listofDeals.stream().filter(o->o.getRangetypecode()==2 && o.getMaxdate().getTime()>=dateDealsDiscount.getDate().getTime() && dateDealsDiscount.getDate().getTime()>=o.getMindate().getTime()).mapToDouble(o->o.getDiscount()).sum();
    }

    public double getTotalPostage() {
        return discount;
    }
}
