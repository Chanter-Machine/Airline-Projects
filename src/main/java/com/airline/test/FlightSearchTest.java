package com.airline.test;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.Flight;
import com.airline.bean.SearchData;
import com.airline.services.Graph;
import com.airline.services.IFlightService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class FlightSearchTest {
	@Autowired
	IFlightService flightService;
	
//	@Test
	public void searchFlightsWithCity() {
		List<Flight> results = flightService.getFlightsWithCityFromDB();
		for(Flight flight: results) {
			System.out.println(flight.getOriCity().getCityname());
			System.out.println("");
		}
	}
	
//	@Test
	public void searchAvailablePath() {
		SearchData searchData = new SearchData();
		searchData.setDestination(1);
		searchData.setOrigin(5);
		searchData.setTraveldate(new Date());
		List<List<Flight>> results = flightService.searchFlights(searchData);
		for(List<Flight> list : results)
		{
			for(Flight flight : list) {
				System.out.print(flight.getFlightid()+"");
			}
			System.out.println("");
		}
	}
	
	@Test
	public void testRemovePath(){
		Date date = new Date();
		//
		GregorianCalendar gc = new GregorianCalendar(2010,1,01);
//		gc.set(Calendar.YEAR,2010);//设置年
//		gc.set(Calendar.MONTH, 1);//这里0是1月..以此向后推
//		gc.set(Calendar.DAY_OF_MONTH, 1);//设置天
//		gc.set(Calendar.HOUR, 0);
		date = gc.getTime();

		SearchData searchData = new SearchData();
		searchData.setDestination(1);
		searchData.setOrigin(5);
		searchData.setTraveldate(date);
		System.out.println(date);
		searchData.setTraveldate(date);
		List<List<Flight>> results = flightService.searchFlights(searchData);
//		System.out.println(results.size());
		for(List<Flight> list : results)
		{
			for(Flight flight : list) {
				System.out.print(flight.getFlightid()+"");
			}
			System.out.println("");
		}
		
	}
}
