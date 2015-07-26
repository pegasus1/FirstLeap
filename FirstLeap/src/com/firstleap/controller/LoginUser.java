package com.firstleap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginUser {
	
	@RequestMapping("login")
	public ModelAndView addUser(@RequestParam("email") String email,
			                    @RequestParam("password") String password) {
 
		

		ModelAndView view = new ModelAndView("Welcome");
		
		view.addObject("email", email);
		view.addObject("password", password);
		
		return view;
	}

}
