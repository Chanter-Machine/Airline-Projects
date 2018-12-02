package com.airline.services.oberver.cancelflight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.airline.bean.FlightRecord;
import com.airline.bean.Passenger;
import com.airline.dao.FlightRecordMapper;

public class FlightRecordObserver implements Observer{

	@Autowired
	FlightRecordMapper flightRecordmapper;
	
	@Override
	public void update(FlightRecord flightRecord) {
		List<Passenger> passengerList = findBookedUser();
	}
	
	/**
	 * Find all users who booked that flight
	 */
	public List<Passenger> findBookedUser() {
		return null;
	}

}
