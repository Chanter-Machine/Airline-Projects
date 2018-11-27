package com.airline.services;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.airline.bean.Flight;
import com.airline.bean.SearchData;

public interface IFlightService {
	public List<Flight> getFlightsFromDB();
	public List<List<Flight>> searchPath(Graph graph, String start, String end);
	public List<List<Flight>> searchFlights(SearchData searchData);
	public List<Flight> getFlightsWithCityFromDB();
//	public void checkFlightRecord(java.util.Date startDate, List<List<Flight>> path);
//	public void getFinalPriceofSearch();
}
