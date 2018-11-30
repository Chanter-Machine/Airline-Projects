package com.airline.handlers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.Flight;
import com.airline.bean.FlightRecord;
import com.airline.bean.ResultInfo;
import com.airline.services.IFlightManagementService;
import com.airline.utils.Msg;

@Controller
public class FlightManagementController {

	@Autowired
	IFlightManagementService flightManagementService;
	
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
	
//	@ResponseBody
//	@RequestMapping(value = "/deleteFlight",method = RequestMethod.POST)
//	public Object deleteFlight(Integer flightid){
//	   ResultInfo resultInfo = new ResultInfo();
//	   if(flightid==null){
//	      resultInfo.setError("post correct pamarameter");
//	      resultInfo.setState(0);
//	      return resultInfo;
//	   }
//
//	   try {
//		   flightManagementService.deletFlight(flight);
////        	IFlightManagementService.deletFlight(flightid);
//	      resultInfo.setState(1);
//	   }catch (Exception e){
//	      resultInfo.setState(0);
//	      resultInfo.setError("fail");
//	   }
//
//	   return resultInfo;
//	}
	
	@ResponseBody
	@RequestMapping(value = "/queryFlights.do",method=RequestMethod.POST)
	public Msg getAllFlights() {
		List<Flight> flights = flightManagementService.getAllFLights();
		return Msg.success().add("results", flights);
	}
	
	@ResponseBody
	@RequestMapping(value = "/cancelFlight.do",method=RequestMethod.POST)
	public void cancelFlight(FlightRecord flightRecord) {
		flightRecord.setStatus("canceled");
		flightManagementService.addFlightRecord(flightRecord);
	}
}
