package com.airline.services;
import java.util.List;
import com.airline.bean.Deal;
import com.airline.bean.Passenger;

public interface IDealService {

    public List<Deal> getAllDeals();
    public int addDeal(Deal deal);
    public void removeDeal(int id);
    public double calculateDiscount(Passenger passenger);
    List<Deal> getAllDealsAndType();

}
