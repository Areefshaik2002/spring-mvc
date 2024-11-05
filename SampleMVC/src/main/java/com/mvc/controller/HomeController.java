package com.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value = "/java")
	public String viewJava() {
		return "java";
	}
	@RequestMapping(value = "/python")
	public String viewPython() {
		return "python";
	}
	@RequestMapping(value = "/spring")
	public String viewSpring() {
		return "spring";
	}
}
