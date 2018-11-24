package com.airline.services.strategy.sorting;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
import com.airline.services.strategy.sorting.utils.SortByMatric;
import com.airline.services.strategy.sorting.utils.ThreadPoolUtil;
@Component("sortByTimeOfFlight")
public class SortByTimeOfFlight implements ISorting{
	
	List<FutureTask<Integer>> taskList;
	
	public List<List<Flight>> sort(Date takeoffDate, List<List<Flight>> path) {
//		System.out.println("================");
		ExecutorService executor = ThreadPoolUtil.getThreadPool();
		taskList = new ArrayList<FutureTask<Integer>>();
		for(List<Flight> list : path) {
			FutureTask<Integer> futureTask = new FutureTask<Integer>(new TimeOfFlightCalculation(list));
			taskList.add(futureTask);
			executor.submit(futureTask);
		}
		return SortByMatric.sort(path, taskList);
//		System.out.println("================================");
//		for(List<Flight> list:path) {
//			for(Flight flight:list) {
//				System.out.print(flight.getFlightid()+" ");
//			}
//			System.out.println("");
//		}
//		System.out.println("================================");
	}
}
