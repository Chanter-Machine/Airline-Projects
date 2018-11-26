package com.airline.handlers;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.Flight;
import com.airline.bean.ResultInfo;
import com.airline.bean.SearchData;
import com.airline.services.IFlightManagementService;
import com.airline.services.IFlightService;

@Controller
public class FlightManagementController {
	
	@Autowired
	IFlightService flightService;
	@Autowired
	IFlightManagementService flightManagementService;
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
	
	@ResponseBody
	@RequestMapping(value = "/addFlight",method=RequestMethod.POST)
	public Object addFlight(Flight flight){
		ResultInfo resultInfo= new ResultInfo();
		if(flight.getOri()==null||flight.getArrivetime().getTime()<flight.getTakeofftime().getTime()) {
			resultInfo.setError("post correct pamarameter");
			resultInfo.setState(0);
			return resultInfo;
			}
		
		try {
			flightManagementService.addFlight(flight);
			resultInfo.setState(1);
		}	
		catch(Exception e) {
			resultInfo.setState(0);
			resultInfo.setError("fail");
		}
		return resultInfo;
	}
	
	@ResponseBody
	@RequestMapping(value = "/deleteFlight",method = RequestMethod.POST)
	public Object deleteFlight(Integer flightid){
	   ResultInfo resultInfo = new ResultInfo();
	   if(flightid==null){
	      resultInfo.setError("post correct pamarameter");
	      resultInfo.setState(0);
	      return resultInfo;
	   }

	   try {
		   
        	IFlightManagementService.deletFlight(flightid);
	      resultInfo.setState(1);
	   }catch (Exception e){
	      resultInfo.setState(0);
	      resultInfo.setError("fail");
	   }

	   return resultInfo;
	}
}
