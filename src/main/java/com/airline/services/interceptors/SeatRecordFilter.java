package com.airline.services.interceptors;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.airline.bean.Flight;
import com.airline.bean.SeatRecord;
import com.airline.utils.DateUtil;

public class SeatRecordFilter implements IPathFilter {

	@Override
	public void filter(Date startDate, List<List<Flight>> path) {
		List<List<Flight>> newPath = new ArrayList<List<Flight>>(); 
		for(List<Flight> list:path) {
			boolean availableFlag = true;
			Map<Integer, Date> mapOfFlightandDate = getMapOfFlightandDate(list, startDate);
			for(Flight flight : list) {
				System.out.println(flight.getFlightid());
				java.sql.Date sqlDate = DateUtil.convertFromJavaDateToSqlDate(mapOfFlightandDate.get(flight.getFlightid()));
				List<SeatRecord> seatRecord = getSeatRecordByDateAndflight(sqlDate, 
						flight.getFlightid());
				if(seatRecord!=null&&seatRecord.size()>0) {
					if(!seatRecord.get(0).checkAvailableSeats()) {
						availableFlag = false;
					}
				}
			}
			System.out.println("");
			
			if(availableFlag==true) {
				newPath.add(list);
			}
		}
	}

}
