package com.airline.aop.memento.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airline.bean.SearchData;

@Component
public class SearchMemento {
	@Autowired
	private SearchData searchData;
	
	public SearchMemento(SearchData searchData) {
		this.searchData = searchData;
	}
	
	public SearchData getSearchData() {
		return this.searchData;
	}
}
