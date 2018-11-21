package com.airline.services.interceptors;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.airline.bean.Flight;
import com.airline.bean.FlightRecord;
import com.airline.utils.DateUtil;

public class FlightRecordFilter implements IPathFilter {

	@Override
	public void filter(Date startDate, List<List<Flight>> path) {
		int span = getFlightsTimeSpan(path);
//    	System.out.println(getFlightsTimeSpan(path));
    	Date arriveDate = new Date();
    	try {
		  arriveDate = DateUtil.getNextDasByNumber(startDate, span);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	List<FlightRecord> records = getRecord(DateUtil.convertFromJavaDateToSqlDate(startDate), 
    			DateUtil.convertFromJavaDateToSqlDate(arriveDate));
    	
    	List<List<Flight>> newPath = new ArrayList<List<Flight>>();
    	
    	for(List<Flight> list : path) {
    		
    		boolean removeFlag = false;
    		Map<Integer, Date> map = getMapOfFlightandDate(list, startDate);
    		
    		for (Entry<Integer, Date> entry : map.entrySet()) { 
    			for(FlightRecord flightRecord: records) {
    				if(flightRecord.getFlightid().equals(entry.getKey()) && 
    						flightRecord.getDate().equals(entry.getValue())) {
    					removeFlag = true;
    					break;
    				}
    				else {
    					System.out.println(flightRecord.getFlightid()+" "+entry.getKey());
    					System.out.println(flightRecord.getDate()+" "+entry.getValue());
    				}
    			}
    		}
    		
    		if(!removeFlag) newPath.add(list);
    	}
//    	return newPath;
		
	}

}
