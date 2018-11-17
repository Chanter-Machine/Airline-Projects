package com.airline.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.Flight;
import com.airline.bean.FlightExample;
import com.airline.bean.SearchData;
import com.airline.bean.FlightExample.Criteria;
import com.airline.dao.FlightMapper;
@Service
public class FlightServiceImp implements IFlightService {

	@Autowired
	FlightMapper flightMapper;
	FlightExample flightExample;
    List<Flight> flights ;
	
	public List<Flight> getFlightsFromDB() {
		flights = flightMapper.selectByExample(flightExample);
		return flights;
	}

	public List<List<Flight>> searchPath(Graph graph, String start, String end) {
	    LinkedList<String> visited = new LinkedList();
	    List<List<String>> results = new LinkedList<List<String>>();
        visited.add(start);
        //Find all available routine.
	    depthFirst(graph, visited, end, results);
        List<List<Flight>> mappedFlights = new ArrayList<List<Flight>>();

	    //Remove the canceled.

        //get flights
        return convertNodes2Flight(results, mappedFlights);
	}
	
	/**
	 * Encapsulated nodes of each flight to flight objects.
	 * @param results Result from depthFirst
	 * @param mappedFlights Result of encapsulated nodes
	 * @return
	 */
	public List<List<Flight>> convertNodes2Flight(List<List<String>> results, List<List<Flight>> mappedFlights) {
		for (List<String> f: results){
			List<Flight> list = new ArrayList<>();
			for (int i = 0; i<(f.size()-1); i++) {
				int origin = Integer.parseInt(f.get(i));
				int destination = Integer.parseInt(f.get(i + 1));
				Flight flight = flights.stream().filter(o -> o.getOri() == origin && o.getDst() == destination).findAny().orElse(null);
				list.add(flight);
			}
			mappedFlights.add(list);
		}
		return mappedFlights;
	}
	
	/**
	 * Invoked by Controller, the result contains available path.
	 */
	public List<List<Flight>> searchFlights(SearchData searchData){
		Graph graph = new Graph();
		List<Flight> flights = getFlightsFromDB();
		for(Flight flight: flights) {
			graph.addEdge(flight.getOri().toString(), flight.getDst().toString());
		}
		List<List<Flight>> results = searchPath(graph, searchData.getOrigin()+"", searchData.getDestination()+"");
		
		checkFlightRecord(searchData.getTraveldate(), results);
		
		return results;
	}
	
	/**
	 * Algorithms that find each path from flight table.
	 * @param graph
	 * @param visited
	 * @param end
	 * @param results
	 */
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
    public void checkFlightRecord(Date startDate, List<List<Flight>> path) {
    	
    }
    
    /**
     * Query all flight records from database
     */
    @Override
    public List<Flight> getFlightsWithCityFromDB() {
    	
    	return flightMapper.selectWIthCity();
    }

    public void calculateCost() {
    	
    }
    
    public void calculateFlightDuration() {
    	
    }
    
    public void calculteWaitTime() {
    	
    }

    
    
}
