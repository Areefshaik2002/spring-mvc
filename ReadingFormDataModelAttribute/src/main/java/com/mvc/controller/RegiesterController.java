package com.mvc.controller;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mvc.model.User;
@Controller
public class RegiesterController {
	@RequestMapping(value = "/doregister")
	public String doRegister(@Valid @ModelAttribute User user,BindingResult result, Model model) {

		if(result.hasErrors()) {
			Map<String, String> errors = new LinkedHashMap<String, String>();
			for(FieldError error: result.getFieldErrors()) {
				errors.put(error.getField(), error.getDefaultMessage());
			}
			model.addAttribute("errors",errors);
			return "errorpage";
		}else {
			model.addAttribute(user);
			return "user";
		}
	}
}


//public String doRegister(@RequestParameter request , Model model) {
//String name = request.getParameter("name");
//String email = request.getParameter("email");
//String password = request.getParameter("password");
//String address = request.getParameter("address");
//String mobile = request.getParameter("mobile");
//
//User user = new User();
//user.setName(name);
//user.setEmail(email);
//user.setPassword(password);
//user.setAddress(address);
//user.setMobile(mobile);
