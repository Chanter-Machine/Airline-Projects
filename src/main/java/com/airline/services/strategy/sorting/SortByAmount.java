package com.airline.services.strategy.sorting;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

import org.springframework.stereotype.Component;

import com.airline.bean.Flight;
import com.airline.services.strategy.sorting.utils.ThreadPoolUtil;
@Component("sortByAmount")
public class SortByAmount implements ISorting {

	List<FutureTask<Integer>> taskList;
	
	public List<List<Flight>> sort(Date takeoffDate, List<List<Flight>> path) {
		ExecutorService executor = ThreadPoolUtil.getThreadPool();
		taskList = new ArrayList<FutureTask<Integer>>();
		for(List<Flight> list : path) {
			FutureTask<Integer> futureTask = new FutureTask<Integer>(new AmountCalculation(list));
			taskList.add(futureTask);
			executor.submit(futureTask);
		}
		
		int min = Integer.MAX_VALUE;
		
		/*for(FutureTask<Integer> task : taskList) {
			try {
				System.out.println(task.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		List<List<Flight>> newPath = new ArrayList<List<Flight>>();
		
		if(path.size()>=2) {
			newPath.add(path.get(0));
			for(int i=1;i<path.size();i++) {
				boolean flag=false;
				for(int j=0;j<i;j++) {
					try {
						if(taskList.get(i).get()<taskList.get(j).get()) {
							newPath.add(j, path.get(i));
							flag=true;
							break;
						}
					} catch (InterruptedException | ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(!flag) newPath.add(path.get(i));
			}
		}
		path = newPath;
//		System.out.println("================================");
//		for(List<Flight> list:path) {
//			for(Flight flight:list) {
//				System.out.print(flight.getFlightid()+" ");
//			}
//			System.out.println("");
//		}
//		System.out.println("================================");
		return path;
	}

	
}
