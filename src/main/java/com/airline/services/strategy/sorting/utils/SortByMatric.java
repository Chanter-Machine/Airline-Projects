package com.airline.services.strategy.sorting.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import com.airline.bean.Flight;

public class SortByMatric {
	public static List<List<Flight>> sort(List<List<Flight>> path, List<FutureTask<Integer>> taskList){
		int min = Integer.MAX_VALUE;
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
		return path;
	}
}
