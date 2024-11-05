package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
	@RequestMapping(value = "petanimals")
	public String getPetAnimals() {
		return "petlist";
	}
	
	@RequestMapping(value = "cat")
	public String getCat() {
		return "cat";
	}
	
	@RequestMapping(value = "dog")
	public String getDion() {
		return "dog";
	}
	
	@RequestMapping(value = "cow")
	public String getCow() {
		return "cow";
	}

}
