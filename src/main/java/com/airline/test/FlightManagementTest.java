package com.airline.test;

import java.util.Date;
import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.Flight;
import com.airline.services.IFlightManagementService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class FlightManagementTest {

	@Autowired
	IFlightManagementService flightManagementService;

	@Test
	public void addFlightTest() {
		Calendar calendar = Calendar.getInstance();
		Date takeoffTime = (Date) calendar.getTime();
		calendar.set(Calendar.HOUR, 15);
		calendar.set(Calendar.MINUTE, 0);
		Date arriveTime =  (Date) calendar.getTime();
		Flight flight = new Flight();
		flight.setOri(1);
		flight.setDst(2);
		flight.setArrivetime(arriveTime);
		flight.setTakeofftime(takeoffTime);
		flight.setPlaneid(1);
		flight.setPrice(120);
		flightManagementService.addFlight(flight);
	}
	public void deletFlightTest() {
		
	}
	}


