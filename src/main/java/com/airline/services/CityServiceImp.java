package com.airline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.City;
import com.airline.dao.CityMapper;
@Service
public class CityServiceImp implements ICityService {

	@Autowired
	CityMapper cityMapper;
	
	public List<City> findAllCityies() {
		return cityMapper.selectByExample(null);
		
	}

}
