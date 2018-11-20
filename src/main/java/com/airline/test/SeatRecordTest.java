package com.airline.test;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.SeatRecord;
import com.airline.services.ISeatRecordService;
import com.airline.utils.DateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class SeatRecordTest {
	
	@Autowired
	ISeatRecordService seatRecordService;
	
	@Test
	public void getSeatRecord() {
		GregorianCalendar gc = new GregorianCalendar(2010,1,1);
		Date takeoffDate =  DateUtil.convertFromJavaDateToSqlDate(gc.getTime());
		int flightId = 7;
		if(takeoffDate==null) System.out.println("asdf");
		List<SeatRecord> records = seatRecordService.getSeatRecordByDateAndflight(takeoffDate, flightId);
		System.out.println(records.get(0).getPlane().getManufacturer());
	}
}
