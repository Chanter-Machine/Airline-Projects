package com.airline.services;
/**
 * 
 * @author Chaofan
 * 
 */
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.FlightRecord;
import com.airline.bean.FlightRecordExample;
import com.airline.bean.FlightRecordExample.Criteria;
import com.airline.dao.FlightRecordMapper;
@Service
public class FlightRecordImp implements IFlightRecordService {

	@Autowired
	FlightRecordMapper flightRecordMapper;
	
	FlightRecordExample flightRecordexample = new FlightRecordExample();
	
	public List<FlightRecord> getRecord(Date takeoffDate, Date arriveDate) {
		Criteria criteria = flightRecordexample.createCriteria();
		criteria.andDateBetween(takeoffDate, arriveDate);
		return flightRecordMapper.selectByExample(flightRecordexample);
	}

}
