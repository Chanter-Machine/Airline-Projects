package com.airline.handlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.City;
import com.airline.services.ICityService;
import com.airline.utils.Msg;

@Controller
public class CityController {
	@Autowired
	private ICityService cityService;
	@ResponseBody
	@RequestMapping("/getCities.do")
	public Msg getCities() {
		List<City>cities = cityService.findAllCityies();
		return Msg.success().add("cities", cities);
	} 
}
