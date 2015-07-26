package com.firstleap.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Ayush Rajoria
 * date : 21 July, 2015
 */
 
@Controller
public class HelloWorld {
 
	@RequestMapping("/userform")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from HelloWorld.java **********</div><br><br>";
		return new ModelAndView("userform", "message", message);
	}
}