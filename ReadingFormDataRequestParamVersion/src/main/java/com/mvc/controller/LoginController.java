package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value = "/checklogin")
	public String doCheck(@RequestParam String email, @RequestParam String password,Model model) {
//		 String email = request.getParameter("email");
//		 String password = request.getParameter("password");
		 if(email.equals("admin@gmail.com")&&password.equals("admin@123")) {
			 String data = "Hello welcome to "+email;
			 model.addAttribute("data",data);
			 return "welcome";
		 }
		 else {
			 String data = "incorrect credentials!!";
			 model.addAttribute("data", data);
			 return "errorpage";
		 }
	}
}
