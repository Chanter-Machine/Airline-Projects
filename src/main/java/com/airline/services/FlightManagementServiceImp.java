package com.airline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.Flight;
import com.airline.bean.FlightRecord;
import com.airline.dao.FlightMapper;
import com.airline.dao.FlightRecordMapper;
import com.airline.dao.FlightandorderMapper;
@Service
public class FlightManagementServiceImp implements IFlightManagementService {

	@Autowired
	FlightMapper flightMapper;
	
	@Autowired
	FlightRecordMapper flightRecordMapper;
	
	@Override
	public void addFlight(Flight flight) {
		flightMapper.insert(flight);
	}

	@Override
	public void deletFlight(Integer flightId) {
		flightMapper.deleteById(flightId);
	}

	public List<Flight> getAllFLights() {
		return flightMapper.selectWIthEverything();
	}
	
	public void addFlightRecord(FlightRecord record) {
		flightRecordMapper.insert(record);
	}

}
