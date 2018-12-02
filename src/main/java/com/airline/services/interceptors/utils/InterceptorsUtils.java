package com.airline.services.interceptors.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.airline.bean.Flight;

public class InterceptorsUtils {
	public static Map<Integer, Date> getMapOfFlightandDate(List<Flight> list, Date startDate) {
    	Map<Integer, Date> map = new HashMap<Integer, Date>();
    	map.put(list.get(0).getFlightid(), startDate);
    	for(int i=1;i<list.size();i++) {
    		if(list.get(i).getTakeofftime().before(list.get(i-1).getArrivetime())) {
    			map.put(list.get(i).getFlightid(), new Date(startDate.getTime()+3600*24*1000));
    		}
    		else {
    			map.put(list.get(i).getFlightid(), map.get(i-1));
    		}
    	}
    	return map;
    }
}
