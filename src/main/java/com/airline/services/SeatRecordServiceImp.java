package com.airline.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.SeatRecord;
import com.airline.bean.SeatRecordExample;
import com.airline.bean.SeatRecordExample.Criteria;
import com.airline.dao.SeatRecordMapper;
@Service
public class SeatRecordServiceImp implements ISeatRecordService {
//	@Autowired
//	SeatRecordExample example;
	@Autowired
	SeatRecordMapper seatRecordMapper;
	
	@Override
	public List<SeatRecord> getSeatRecordByDateAndflight(Date takeoffDate, int flightId) {
		SeatRecordExample example = new SeatRecordExample(); 
		Criteria criteria = example.createCriteria();
		criteria.andDateEqualTo(takeoffDate);
		criteria.andFlightidEqualTo(flightId+"");
		System.out.println(flightId);
		return seatRecordMapper.selectByExampleWithPlane(example);
	}

}
