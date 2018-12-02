package com.airline.services;

import java.sql.Date;
import java.util.List;

import com.airline.bean.FlightRecord;

public interface IFlightRecordService {
	public List<FlightRecord> getRecord(Date takeoffDate, Date arriveDate);
}
