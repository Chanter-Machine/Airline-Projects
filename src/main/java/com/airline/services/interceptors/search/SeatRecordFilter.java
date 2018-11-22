package com.airline.services.interceptors.search;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
import com.airline.bean.SeatRecord;
import com.airline.bean.SeatRecordExample;
import com.airline.dao.SeatRecordMapper;
import com.airline.services.interceptors.utils.InterceptorsUtils;
import com.airline.utils.DateUtil;
@Component("seatRecordFilter")
public class SeatRecordFilter implements IPathFilter {
	@Autowired
	SeatRecordMapper seatRecordMapper;
	
	@Override
	public List<List<Flight>> pathFilter(Date takeoffDate, List<List<Flight>> path) {
		List<List<Flight>> newPath = new ArrayList<List<Flight>>(); 
		for(List<Flight> list:path) {
			boolean availableFlag = true;
			Map<Integer, Date> mapOfFlightandDate = InterceptorsUtils.getMapOfFlightandDate(list, takeoffDate);
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
		return newPath;
	}

	public List<SeatRecord> getSeatRecordByDateAndflight(Date takeoffDate, int flightId) {
		SeatRecordExample example = new SeatRecordExample(); 
		com.airline.bean.SeatRecordExample.Criteria criteria = example.createCriteria();
		criteria.andDateEqualTo(takeoffDate);
		criteria.andFlightidEqualTo(flightId+"");
		System.out.println(flightId);
		return seatRecordMapper.selectByExampleWithPlane(example);
	}
}
