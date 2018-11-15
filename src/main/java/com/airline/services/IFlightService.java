package com.airline.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.airline.bean.Flight;

public interface IFlightService {
	public List<Flight> getFlightsByDate(String takeOffDate);
	public List<List<String>> serchFlight(Graph graph, String start, String end);
}
