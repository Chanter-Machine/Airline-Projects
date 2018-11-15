package com.airline.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.Flight;
import com.airline.bean.FlightExample;
import com.airline.bean.FlightExample.Criteria;
import com.airline.dao.FlightMapper;
@Service
public class FlightServiceImp implements IFlightService {

	@Autowired
	FlightMapper flightMapper;
	FlightExample flightExample;
	
	public List<Flight> getFlightsByDate(String takeOffDate) {
		
		flightExample = new FlightExample();
		Criteria criteria = flightExample.createCriteria();
//		criteria.andTakeoffdateEqualTo(java.sql.Date.valueOf(takeOffDate));
		List<Flight> flights = flightMapper.selectByExample(flightExample);
		for (int i = 0; i < flights.size(); i++) {
			System.out.println("time = " +flights.get(i).getArrivetime());
		}
		return flights;
	}

	public List<List<String>> serchFlight(Graph graph, String start, String end) {
	    LinkedList<String> visited = new LinkedList();
	    List<List<String>> results = new LinkedList<List<String>>();
        visited.add(start);
        //Find all available routine.
	    depthFirst(graph, visited, end, results);
	    //Remove the canceled.
	    return results;
	}
	
	private void depthFirst(Graph graph, LinkedList<String> visited, String end, List<List<String>> results) {
        LinkedList<String> nodes = graph.adjacentNodes(visited.getLast());
        // examine adjacent nodes
        for (String node : nodes) {
            if (visited.contains(node)) {
                continue;
            }
            if (node.equals(end)) {
                visited.add(node);
                printPath(visited, results);
                visited.removeLast();
                break;
            }
        }
        for (String node : nodes) {
            if (visited.contains(node) || node.equals(end)) {
                continue;
            }
            visited.addLast(node);
            depthFirst(graph, visited, end, results);
            visited.removeLast();
        }
    }

    private void printPath(LinkedList<String> visited, List<List<String>> results) {
    	List<String>  result = new ArrayList<String>();
        for (String node : visited) {
//            System.out.print(node);
//            System.out.print(" ");
            result.add(node);
        }
        results.add(result);
//        System.out.println();
    }
    
    /**
     * check record in Table flightRecord, find if there is a flight is canceled
     * in schedule. 
     */
    public void checkFlightRecord() {
    	
    }

    public void calculateCost() {
    	
    }
    
    public void calculateFlightDuration() {
    	
    }
    
    public void calculteWaitTime() {
    	
    }
    
    
}
