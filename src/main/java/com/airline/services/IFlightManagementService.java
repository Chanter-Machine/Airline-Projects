package com.airline.services;
import java.util.Date;
import java.util.List;

import com.airline.bean.Flight;
import com.airline.bean.FlightRecord;

public interface IFlightManagementService {
// 插入数据 flight
	public void addFlight(Flight flight);
	public void deletFlight(Integer flightId);
	public List<Flight> getAllFLights();
	public void addFlightRecord(FlightRecord record);
}
