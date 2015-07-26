package com.firstleap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowRegistrationForm {
	
	@RequestMapping("registerUser")
	public ModelAndView addUser() {
 
		ModelAndView view = new ModelAndView("UserRegistrationForm");
		return view;
	}

}
