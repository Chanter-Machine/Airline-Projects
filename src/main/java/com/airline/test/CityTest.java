package com.airline.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.City;
import com.airline.services.ICityService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class CityTest {
	@Autowired
	ICityService cityService;
	
	@Test
	public void getAllCities() {
		List<City>cities = cityService.findAllCityies();
		for(int i=0;i< cities.size();i++) {
			System.out.println(cities.get(i).getCityname());
		}
	}
}
