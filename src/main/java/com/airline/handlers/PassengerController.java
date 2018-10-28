package com.airline.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airline.bean.Passenger;


@Controller
public class PassengerController {

	
	@RequestMapping("/login.do")
	public void loginCheck(Passenger p) {

		
		System.out.println(p.getPassword());
	}
}
