package com.firstleap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterUser {
	
	@RequestMapping("add")
	public ModelAndView addUser(@RequestParam("name") String name,
			                    @RequestParam("email") String email,
			                    @RequestParam("phone") String phone,
			                    @RequestParam("address") String address,
			                    @RequestParam("password") String password) {
 
		Customer customer = new Customer();
		customer.setCustomerName(name);
		customer.setEmailId(email);
		customer.setPhoneNumber(phone);
		customer.setAddress(address);
		customer.setPassword(password);


		ModelAndView view = new ModelAndView("UserLoginForm");
		
		view.addObject("name", name);
		view.addObject("email", email);
		view.addObject("phone", phone);
		view.addObject("address", address);
		
		return view;
	}
}
