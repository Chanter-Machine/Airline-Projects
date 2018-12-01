package com.airline.services;

import java.util.List;
import com.airline.bean.*;
import com.airline.dao.DealAgeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealAgeServiceImp implements IDealAgeService{

    @Autowired
    DealAgeMapper dealAgeMapper;

    DealAgeExample dealAgeExample = new DealAgeExample();
    DealAge dealAge;

    @Override
   public int addDealAge(DealAge dealAge) {
   // public int addDealAge() {
        dealAgeMapper.insert(dealAge);
        return dealAge.getRangeid();
    }

    @Override
    public void removeDealAge(int id) {
        dealAgeMapper.deleteByPrimaryKey(id);
    }
}
