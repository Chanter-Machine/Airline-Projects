package com.airline.services.interceptors.search;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
import com.airline.bean.FlightRecord;
import com.airline.bean.FlightRecordExample;
import com.airline.dao.FlightRecordMapper;
import com.airline.services.PathCollection;
import com.airline.services.interceptors.utils.InterceptorsUtils;
import com.airline.utils.DateUtil;
@Component("flightRecordFilter")
public class FlightRecordFilter implements IPathFilter {
	@Autowired
	FlightRecordMapper flightRecordMapper;
	
	@Override
	public List<List<Flight>> pathFilter(PathCollection pathCollection) {
		int span = getFlightsTimeSpan(pathCollection.getPathList());
//    	System.out.println(getFlightsTimeSpan(path));
    	Date arriveDate = new Date();
    	try {
		  arriveDate = DateUtil.getNextDasByNumber(pathCollection.getTakeoffDate(), span);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	List<FlightRecord> records = getRecord(DateUtil.convertFromJavaDateToSqlDate(pathCollection.getTakeoffDate()), 
    			DateUtil.convertFromJavaDateToSqlDate(arriveDate));
    	
    	List<List<Flight>> newPath = new ArrayList<List<Flight>>();
    	
    	for(List<Flight> list : pathCollection.getPathList()) {
    		
    		boolean removeFlag = false;
    		Map<Integer, Date> map = InterceptorsUtils.getMapOfFlightandDate(list, pathCollection.getTakeoffDate());
    		
    		for (Entry<Integer, Date> entry : map.entrySet()) { 
    			for(FlightRecord flightRecord: records) {
    				if(flightRecord.getFlightid().equals(entry.getKey()) && 
    						flightRecord.getDate().equals(entry.getValue())) {
    					removeFlag = true;
    					break;
    				}
    				else {
//    					System.out.println(flightRecord.getFlightid()+" "+entry.getKey());
//    					System.out.println(flightRecord.getDate()+" "+entry.getValue());
    				}
    			}
    		}
    		
    		if(!removeFlag) newPath.add(list);
    	}
//    	System.out.println("==============================");
//    	for(List<Flight> list:path) {
//    		for(Flight flight:list) {
//    			System.out.print(flight.getFlightid());
//    		}
//    		System.out.println("");
//    	}
//    	System.out.println("==============================");
    	pathCollection.setPathList(newPath);
    	return newPath;
	}

	
	/**
     * Input several path and return the last date of all possible 
     * arrival date.
     * @param path
     * @return
     */
    public int getFlightsTimeSpan(List<List<Flight>> path) {
    	int max = 0;
    	for(List<Flight> list : path) {
    		int span = 0;
    		for(int i=0; i<list.size()-1;i++) {
    			if(!list.get(i).getArrivetime().before(list.get(i+1).getTakeofftime())) {
    				span++;
    			}
    		}
    		if(span>=max) {
    			max = span;
    		}
    	}
    	return max;
    }
    
    /**
     * Get Flight Record
     * @param takeoffDate
     * @param arriveDate
     * @return
     */
    public List<FlightRecord> getRecord(Date takeoffDate, Date arriveDate) {
		FlightRecordExample flightRecordexample = new FlightRecordExample();
		com.airline.bean.FlightRecordExample.Criteria criteria = flightRecordexample.createCriteria();
		criteria.andDateBetween(takeoffDate, arriveDate);
		return flightRecordMapper.selectByExample(flightRecordexample);
	}

}
