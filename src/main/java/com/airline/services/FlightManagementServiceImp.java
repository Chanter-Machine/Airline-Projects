package com.airline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.Flight;
import com.airline.dao.FlightMapper;
@Service
public class FlightManagementServiceImp implements IFlightManagementService {

	@Autowired
	FlightMapper flightMapper;
	
	@Override
	public void addFlight(Flight flight) {
		flightMapper.insert(flight);
	}

	public void deletFlight(Flight flight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletFlight(Integer flight) {
		// TODO Auto-generated method stub
		
	}

}
