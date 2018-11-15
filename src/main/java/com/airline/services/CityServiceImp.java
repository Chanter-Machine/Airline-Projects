package com.airline.services;

import com.airline.bean.City;
import com.airline.bean.CityExample;
import com.airline.dao.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImp implements ICityService {
    @Autowired
    CityMapper cityMapper;

    public List<City> getCities() {
        CityExample cityExample = new CityExample();
        return cityMapper.selectByExample(cityExample);
    }
}
