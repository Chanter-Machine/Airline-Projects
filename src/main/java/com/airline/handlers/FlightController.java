package com.airline.handlers;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.Flight;
import com.airline.bean.SearchData;
import com.airline.services.IFlightService;

@Controller
public class FlightController {
	
	@Autowired
	IFlightService flightService;
	
	@ResponseBody
	@RequestMapping("/search.do")
	public void search(SearchData searchData) {
		System.out.println(searchData);
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("今天的日期："+df.format(searchData.getTraveldate()));
		
//		List<Flight> flights = flightService.getFlightsByDate(searchData.getTraveldate().toString());
	}
	
	@ResponseBody
	@RequestMapping("/search2.do")
	public void search2(SearchData searchData) {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		
		List<List<Flight>> flights = flightService.searchFlights(searchData);
		for(List<Flight> list : flights) {
			for(Flight flight: list) {
				System.out.print(flight.getFlightid()+" ");
			}
			System.out.println("");
		}
	}
}
