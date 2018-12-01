package com.airline.services;
import java.util.List;
import com.airline.bean.Deal;

public interface IDealService {

    public List<Deal> getAllDeals();
    public int addDeal(Deal deal);
    public void removeDeal(int id);
}
