package com.airline.services;

import java.sql.Date;
import java.util.List;

import com.airline.bean.SeatRecord;

public interface ISeatRecordService {
	public List<SeatRecord> getSeatRecordByDateAndflight(Date takeoffDate, int flightId);
}
