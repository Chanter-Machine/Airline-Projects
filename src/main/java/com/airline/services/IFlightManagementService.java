package com.airline.services;
import java.util.Date;
import com.airline.bean.Flight;

public interface IFlightManagementService {
// 插入数据 flight
	public void addFlight(Flight flight);
	public void deletFlight(Integer flight );
}
