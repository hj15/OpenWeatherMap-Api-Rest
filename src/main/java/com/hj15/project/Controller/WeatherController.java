package com.hj15.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {
	
	@RequestMapping("/")
	public String getPage() {
		return "home";
	}
}
