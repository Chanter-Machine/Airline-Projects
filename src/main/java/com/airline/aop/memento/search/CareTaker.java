package com.airline.aop.memento.search;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CareTaker {
	
	private List<SearchMemento> searchMementoList = new ArrayList<SearchMemento>();
	
	public void add(SearchMemento searchMemento) {
		searchMementoList.add(searchMemento);
	}
	
	public SearchMemento getSearchMemento(int index) {
		return searchMementoList.get(index);
	}
	
	
}
