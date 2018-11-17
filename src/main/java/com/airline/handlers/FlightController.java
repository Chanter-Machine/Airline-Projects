package com.airline.handlers;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.SearchData;

@Controller
public class FlightController {
	
	@ResponseBody
	@RequestMapping("/search.do")
	public void search(SearchData searchData) {
		System.out.println(searchData);
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("今天的日期："+df.format(searchData.getTraveldate()));
	}
}
