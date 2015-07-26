package com.firstleap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowLoginForm {
	
	@RequestMapping("loginUser")
	public ModelAndView addUser() {
 
		ModelAndView view = new ModelAndView("UserLoginForm");
		return view;
	}

}
