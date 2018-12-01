package com.airline.services;

import com.airline.bean.Dealdate;
import com.airline.bean.DealdateExample;
import com.airline.dao.DealdateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealDateServiceImp implements IDealDateService{

    @Autowired
    DealdateMapper dealdateMapper;

    DealdateExample dealdateExample = new DealdateExample();

    @Override
    public int addDealDate(Dealdate dealdate) {
        dealdateMapper.insert(dealdate);
        return dealdate.getRangeid();
    }

    @Override
    public void removeDealDate(int id) {
        dealdateMapper.deleteByPrimaryKey(id);
    }
}
