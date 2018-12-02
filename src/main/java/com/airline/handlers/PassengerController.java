package com.airline.handlers;

import com.airline.bean.*;
import com.airline.security.Validator;
import com.airline.services.ICityService;
import com.airline.services.IPassengerService;
import com.airline.services.IUserActivationService;
import com.airline.services.order.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.airline.services.IUserService;
import com.airline.utils.Msg;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class PassengerController {
	@Autowired
	IUserService userService;

	@Autowired
	IPassengerService passengerService;

	@Autowired
	ICityService cityService;

	@Autowired
	IUserActivationService userActivationService;

	@Autowired
	IOrderService orderService;


	@RequestMapping("/login.do")
	public ModelAndView loginCheck(HttpServletRequest request, User loginuser) {

		// validate data before attempting to processing
		boolean containsBadData = new Validator(loginuser).validate();
		/*Login login = new Login();
		login.email=loginuser.getEmail();
		login.password=loginuser.getPassword();
		ReflectionUtils.*/

		ModelAndView mv = new ModelAndView();

		if (!containsBadData) {

			User user = userService.validateUser(loginuser);
			Msg result = userService.getResult();
			System.out.println(user.getActivated());
			if (user != null) {
				if (user.getActivated() == null || user.getActivated() == false) {
					request.getSession().setAttribute("temp_no", user.getUserid());
					request.getSession().setAttribute("temp_user", user);
					//mv.addObject("result", result);
					result.setSuccessful(false);
					result.setMsg("Your account has not yet been activated, please check your email and activate your account with the code that was sent to your mailbox");

					mv.setViewName("/WEB-INF/view/activation.jsp");
				} else {

					request.getSession().setAttribute("user", user);
					mv = loggedOnUser(user);
					mv.addObject("user", user);
				}
			} else {
				mv.setViewName("index.jsp");
			}

			mv.addObject("result", result);
		}
		else {
			mv.addObject("error", "Data contains invalid characters and can therefore not be used to complete your registration.");
			mv.setViewName("index.jsp");
		}

		return mv;
	}
	
	@RequestMapping("/login2.do")
	@ResponseBody
	public Msg loginCheck2(User u) {
		User user = userService.validateUser(u);
		return Msg.success().add("user", user);
	}

	@RequestMapping("/register.do")
	public ModelAndView registerUser(HttpServletRequest request, Passenger passenger) {

	    // validate data before attempting to processing
        boolean containsBadData = new Validator(passenger).validate();
        Msg result = new Msg();


        //return result;
        ModelAndView mv = new ModelAndView();

        if (!containsBadData) {
            passenger.setRole(1);
            passengerService.register(passenger);
            if (passenger.getUserid() != null) {
                int userid = passenger.getUserid();
                request.getSession().setAttribute("temp_no", userid);
                request.getSession().setAttribute("temp_user", passenger);

                result.success();
                result.setMsg("Your details have been submitted successfully. We have sent you an activation code to complete your account creation, please check your mailbox for a mail from us and use it in the form below.");
            } else {
                //result
                result.fail();
            }

            //return generated activation code sent to user's email
			mv.addObject("result", result);
            mv.setViewName("/WEB-INF/view/activation.jsp");
        } else {
        	mv.addObject("error", "Data contains invalid characters and can therefore not be used to complete your registration.");
            mv.setViewName("index.jsp");
        }

		return mv;

	}

	@RequestMapping("/validate.do")
	@ResponseBody
	public Msg activationCheck(HttpServletRequest request, @RequestParam(name="code", required=false, defaultValue="0") String code){

		int userid = Integer.parseInt(request.getSession().getAttribute("temp_no").toString());

		Boolean valid = false;
		Msg result = new Msg();

		try {
			valid = userActivationService.validateActivationCode(userid, Integer.parseInt(code));

			if (valid) {
				request.getSession().setAttribute("user", request.getSession().getAttribute("temp_user"));
				request.getSession().setAttribute("temp_user", null);
			}
			else {
				result.setMsg("incorrect code provided!");
			}

		} catch (NumberFormatException ex){
			result.setMsg("code format not allowed!");
		}

		result.setSuccessful(valid);
		//result.add("userid", userid);

		return result;
	}


	public ModelAndView loggedOnUser(User user){

		ModelAndView mv = new ModelAndView();
		List<City> cities = cityService.findAllCityies();

		Passenger p = (Passenger) user;
		List<UserFlight> allorders = orderService.orderWithFlightByPassenger(p.getPassengerid());
		List<Integer> orderIDs = allorders.stream().map(o->o.getOrderID()).distinct().collect(Collectors.toList());
		mv.addObject("cities", cities);
		mv.addObject("uniqueOrders", orderIDs);
		mv.addObject("orders", allorders);
		mv.setViewName("/WEB-INF/view/login.jsp");

		return mv;
	}

}
