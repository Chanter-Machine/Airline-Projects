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
		
	}
	
	@ResponseBody
	@RequestMapping("/search2.do")
	public Msg search2(SearchData searchData) {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");

		searchResult = flightService.searchFlights(searchData);

		return Msg.success().add("insuranceList", searchResult.getPriceCollection().getInsuranceList())
							.add("taxList", searchResult.getPriceCollection().getTaxList())
							.add("priceList", searchResult.getPriceCollection().getPriceList())
							.add("pathList", searchResult.getPathCollection().getPathList())
							.add("takeoffDate", searchResult.getPathCollection().getTakeoffDate());
		
	}
}
