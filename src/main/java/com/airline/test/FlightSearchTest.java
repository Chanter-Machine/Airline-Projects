package com.airline.test;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.Flight;
import com.airline.services.IFlightService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class FlightSearchTest {
	@Autowired
	IFlightService flightService;
	@Test
	public void searchByDate() {
		String date = "2010-02-01";
		List<Flight> flights = flightService.getFlightsByDate(date);
//		for(Flight flight: flights) {
//			System.out.println("FlightId: "+ flight.getFlightid());
//		}
	}
}
