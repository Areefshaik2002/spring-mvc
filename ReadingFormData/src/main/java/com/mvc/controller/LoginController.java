package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value = "/checklogin")
	public String doCheck(HttpServletRequest request) {
		 String email = request.getParameter("email");
		 String password = request.getParameter("password");
		 if(email.equals("admin@gmail.com")&&password.equals("admin@123")) {
			 return "welcome";
		 }
		 else {
			 return "errorpage";
		 }
	}
}
