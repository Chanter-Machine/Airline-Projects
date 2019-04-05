package com.airline.handlers;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.Flight;
import com.airline.bean.SearchData;
import com.airline.services.IFlightService;
import com.airline.services.SearchResult;
import com.airline.utils.Msg;

@Controller
public class FlightController {
	@Autowired
	SearchResult searchResult;
	
	@Autowired
	IFlightService flightService;
	
	@ResponseBody
	@RequestMapping("/search.do")
	public void search(SearchData searchData) {
		System.out.println(searchData);
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Today's date："+df.format(searchData.getTraveldate()));
		
//		List<Flight> flights = flightService.getFlightsByDate(searchData.getTraveldate().toString());
	}
	
	@ResponseBody
	@RequestMapping("/search2.do")
	public Msg search2(SearchData searchData) {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(searchData);
//		searchData.setSorting("1");
		searchResult = flightService.searchFlights(searchData);
//		for(List<Flight> list : searchResult.getPathCollection().getPathList()) {
//			for(Flight flight: list) {
//				System.out.print(flight.getFlightid()+" ");
//			}
//			System.out.println("");
//		}
//		System.out.println(searchResult.getPathCollection().getTakeoffDate());
//		for(int insurance: searchResult.getPriceCollection().getInsuranceList()) {
//			System.out.println("insurance: "+insurance);
//		}
//		for(int tax: searchResult.getPriceCollection().getTaxList()) {
//			System.out.println("tax: "+tax);
//		}
//		for(int price: searchResult.getPriceCollection().getPriceList()) {
//			System.out.println("Total price: "+ price);
//		}
		
		return Msg.success().add("insuranceList", searchResult.getPriceCollection().getInsuranceList())
							.add("taxList", searchResult.getPriceCollection().getTaxList())
							.add("priceList", searchResult.getPriceCollection().getPriceList())
							.add("pathList", searchResult.getPathCollection().getPathList())
							.add("takeoffDate", searchResult.getPathCollection().getTakeoffDate());
		
	}
}
