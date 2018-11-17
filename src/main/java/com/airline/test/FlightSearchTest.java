package com.airline.test;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.Flight;
import com.airline.services.Graph;
import com.airline.services.IFlightService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class FlightSearchTest {
	@Autowired
	IFlightService flightService;
	@Test
	public void searchByDate() {
		Graph graph = new Graph();
		String startDate = "2010-02-01";
		List<Flight> flights = flightService.getFlightsByDate(startDate);
		for(Flight flight: flights) {
			graph.addEdge(flight.getOri().toString(), flight.getDst().toString());
		}

		List<List<Flight>> results = flightService.searchFlight(graph, "5", "1");

		for(List<Flight> list: results) {
			for(Flight flight: list) {
				System.out.print(flight.getArrivetime().getTime()+" ");
			}
			System.out.println("");
		}
	}
}
