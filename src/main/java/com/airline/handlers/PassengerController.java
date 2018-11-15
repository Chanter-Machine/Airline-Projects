package com.airline.handlers;

import com.airline.bean.Passenger;
import com.airline.bean.Visitor;
import com.airline.services.IPassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.airline.bean.User;
import com.airline.services.IUserService;
import com.airline.utils.Msg;


@Controller
public class PassengerController {
	@Autowired
	IUserService userService;

	@Autowired
	IPassengerService passengerService;

	@RequestMapping("/login.do")
	public ModelAndView loginCheck(User u) {

		User user = userService.queryUser(u.getEmail(), u.getPassword());
		
		ModelAndView mv = new ModelAndView(); 
		mv.addObject("user", user);
		mv.setViewName("/WEB-INF/view/login.jsp");

		return mv;
	}
	
	@RequestMapping("/login2.do")
	@ResponseBody
	public Msg loginCheck2(User u) {
		User user = userService.queryUser(u.getEmail(), u.getPassword());
		return Msg.success().add("user", user);
	}

	@RequestMapping("/register.do")
	public ModelAndView registerUser(Visitor visitor) {

		Passenger p = new Passenger(); //visitor.getPassengerInfo();
		User u = new User(); //visitor.getUserInfo();

			u.setRole("passenger");
			u.setPassword(visitor.getPassword());
			u.setEmail(visitor.getEmail());
			passengerService.createPassengerAccount(u);

			if (u.getUserid()!=null){
				p.setPassengername(visitor.getPassengername());
				p.setAddress(visitor.getAddress());
				p.setAge(visitor.getAge());
				p.setPhone(visitor.getPhone());
				p.setUserid(u.getUserid());

				passengerService.savePassengerInfo(p);
			}

		ModelAndView mv = new ModelAndView();
		mv.addObject("user", u);
		mv.setViewName("/WEB-INF/view/login.jsp");

		return mv;

	}

}
