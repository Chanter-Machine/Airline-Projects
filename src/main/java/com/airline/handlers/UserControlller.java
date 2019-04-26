package com.airline.handlers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.User;

@Controller
public class UserControlller {

	
	
	@ResponseBody
	@RequestMapping("/getUser.do")
	public void getCities() {
	} 
	
	@ResponseBody
	@RequestMapping("/sendMessage.do")
	public void sendMessage(String Message, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		Long timeStamp = System.currentTimeMillis();
	}
}
