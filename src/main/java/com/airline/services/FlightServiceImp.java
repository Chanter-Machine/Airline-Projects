package com.airline.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.Flight;
import com.airline.bean.FlightExample;
import com.airline.bean.FlightExample.Criteria;

import com.airline.dao.FlightMapper;
@Service
public class FlightServiceImp implements IFlightService {

	@Autowired
	FlightMapper flightMapper;
	FlightExample flightExample;
	
	public List<Flight> getFlightsByDate(String date) {
		flightExample = new FlightExample();
		Criteria criteria = flightExample.createCriteria();
		criteria.andDateEqualTo(java.sql.Date.valueOf(date));
		List<Flight> flights = flightMapper.selectByExample(flightExample);
		return flights;
	}

	 
}
