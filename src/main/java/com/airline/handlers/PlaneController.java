package com.airline.handlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.City;
import com.airline.bean.Plane;
import com.airline.services.IPlaneService;
import com.airline.utils.Msg;

@Controller
public class PlaneController {

	@Autowired
	IPlaneService planeService;
	
	@ResponseBody
	@RequestMapping("/getPlanes.do")
	public Msg getCities() {
		List<Plane> planes = planeService.findAllPlanes();
		return Msg.success().add("planes", planes);
	} 
}
