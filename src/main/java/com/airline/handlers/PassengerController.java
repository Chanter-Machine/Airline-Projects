package com.airline.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.airline.bean.User;
import com.airline.services.IUserService;
import com.airline.utils.Msg;


@Controller
public class PassengerController {
	@Autowired
	IUserService userService;
	
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
	
}
