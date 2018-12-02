package com.airline.services;

import java.util.List;
import com.airline.bean.*;
import com.airline.dao.DealtypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airline.bean.DealtypeExample;
import com.airline.bean.DealtypeExample.Criteria;

@Service
public class DealTypeServiceImp implements IDealTypeService {

    @Autowired
    DealtypeMapper dealtypeMapper;

    DealtypeExample dealtypeExample = new DealtypeExample();

    Dealtype dealtype;

    @Override
    public void addDealtype(Dealtype dealtype) {

        dealtypeMapper.insert(dealtype);
    }

    @Override
    public void removeDealtype(int id) {
        dealtypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Dealtype> getAllDealTypes() {
        Criteria criteria = dealtypeExample.createCriteria();
        criteria.andTypeidIsNotNull();
        criteria.andTypeIsNotNull();

        List<Dealtype> dealtypeList = dealtypeMapper.selectByExample(dealtypeExample);

        return dealtypeList;
    }
}
