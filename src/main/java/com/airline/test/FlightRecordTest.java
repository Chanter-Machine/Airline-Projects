package com.airline.test;

import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.FlightRecord;
import com.airline.services.IFlightRecordService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class FlightRecordTest {
	@Autowired
	IFlightRecordService flightRecordService;
	
	@Test
	public void FlightRecordTest() {
		List<FlightRecord> record = flightRecordService.getRecord(Date.valueOf("2010-02-01"), Date.valueOf("2010-02-03"));
		for(FlightRecord flightRecord:record) {
			System.out.println(flightRecord.getDate()+" ");
			java.util.Date utilDate = new java.util.Date(flightRecord.getDate().getTime());
			System.out.println(utilDate);
			
		}
	}
}
