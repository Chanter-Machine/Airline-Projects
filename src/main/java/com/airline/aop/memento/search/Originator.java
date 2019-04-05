package com.airline.aop.memento.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airline.bean.SearchData;

@Component
public class Originator {
	@Autowired
	private SearchData searchData;
	
	public void setSearchData(SearchData searchData) {
		this.searchData = searchData;
	}
	
	public SearchData getSearchData() {
		return searchData;
	}
	
	public SearchMemento saveSearchData2Menento() {
		return new SearchMemento(searchData);
	}
	
	public void getSearchMemento(SearchMemento searchMemento) {
		searchData = searchMemento.getSearchData();
	}
}
