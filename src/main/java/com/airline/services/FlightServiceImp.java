package com.airline.services;
/**
 * 
 * @author Chaofan
 * 
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.Flight;
import com.airline.bean.FlightExample;
import com.airline.bean.SearchData;
import com.airline.bean.FlightExample.Criteria;
import com.airline.bean.FlightRecord;
import com.airline.dao.FlightMapper;
import com.airline.utils.DateUtil;
@Service
public class FlightServiceImp implements IFlightService {

	@Autowired
	FlightMapper flightMapper;
	@Autowired
	IFlightRecordService flightRecordService;
	FlightExample flightExample;
    List<Flight> flights;
	
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

//	    Remove the canceled.
        
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
		
		results = checkFlightRecord(searchData.getTraveldate(), results);
		
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
     * @param date Date of takeoff.
     */
    public List<List<Flight>> checkFlightRecord(java.util.Date startDate, List<List<Flight>> path) {
    	int span = getFlightsTimeSpan(path);
//    	System.out.println(getFlightsTimeSpan(path));
    	Date arriveDate = new Date();
    	try {
		  arriveDate = DateUtil.getNextDasByNumber(startDate, span);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	List<FlightRecord> records = flightRecordService.getRecord(DateUtil.convertFromJavaDateToSqlDate(startDate), 
    			DateUtil.convertFromJavaDateToSqlDate(arriveDate));
//    	System.out.println("records size = "+ records.size());
    	List<Integer> listOfFlightId = new ArrayList<Integer>();
    	for(FlightRecord flightRecord : records) {
    		listOfFlightId.add(flightRecord.getFlightid());
    	}
    	
    	List<List<Flight>> newPath = new ArrayList<List<Flight>>();
    	
    	for(List<Flight> list : path) {
    		
    		boolean removeFlag = false;
    		Map<Integer, Date> map = getMapOfFlightandDate(list, startDate);
    		
    		for (Entry<Integer, Date> entry : map.entrySet()) { 
    			for(FlightRecord flightRecord: records) {
    				if(flightRecord.getFlightid().equals(entry.getKey()) && 
    						flightRecord.getDate().equals(entry.getValue())) {
    					removeFlag = true;
    					break;
    				}
    				else {
    					System.out.println(flightRecord.getFlightid()+" "+entry.getKey());
    					System.out.println(flightRecord.getDate()+" "+entry.getValue());
    				}

    			}
    		}
    		
    		if(!removeFlag) newPath.add(list);
    	}
    	return newPath;
    }
    
    public Map<Integer, Date> getMapOfFlightandDate(List<Flight> list, Date startDate) {
    	Map<Integer, Date> map = new HashMap<Integer, Date>();
    	map.put(list.get(0).getFlightid(), startDate);
    	for(int i=1;i<list.size();i++) {
//    		System.out.println("list size"+list.size());
    		if(list.get(i).getTakeofftime().before(list.get(i-1).getArrivetime())) {
    			map.put(list.get(i).getFlightid(), new Date(startDate.getTime()+3600*24*1000));
//    			System.out.println(new Date(startDate.getTime()+3600*24*1000));
    		}
    		else {
    			map.put(list.get(i).getFlightid(), map.get(i-1));
//    			System.out.println(map.get(i-1));
    		}
    	}
    	return map;
    }
    
    
    /**
     * Input several path and return the last date of all possible 
     * arrival date.
     * @param path
     * @return
     */
    public int getFlightsTimeSpan(List<List<Flight>> path) {
    	int max = 0;
    	for(List<Flight> list : path) {
    		int span = 0;
    		for(int i=0; i<list.size()-1;i++) {
    			if(!list.get(i).getArrivetime().before(list.get(i+1).getTakeofftime())) {
    				span++;
    			}
    		}
    		if(span>=max) {
    			max = span;
    		}
    	}
    	return max;
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
