package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WildController {
	@RequestMapping(value = "wildanimals")
	public String getWildAnimals() {
		return "wildlist";
	}
	
	@RequestMapping(value = "tiger")
	public String getTiger() {
		return "tiger";
	}
	
	@RequestMapping(value = "lion")
	public String getLion() {
		return "lion";
	}
	
	@RequestMapping(value = "cheetah")
	public String getCheetah() {
		return "cheetah";
	}

}
