package com.airline.services;

import java.util.List;
import com.airline.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airline.dao.AdvertMapper;

@Service
public class AdvertServiceImp implements IAdvertService{

    @Autowired
    AdvertMapper advertMapper;

    AdvertExample advertExample = new AdvertExample();

    @Override
    public List<Advert> getAllAdverts(){
        return advertMapper.selectByExample(advertExample);
    }

    @Override
    public void addAdvert(Advert advert){
        advertMapper.insert(advert);
    }
    @Override
    public void removeAdvert(int advertid){
        advertMapper.deleteByPrimaryKey(advertid);

    }
}
