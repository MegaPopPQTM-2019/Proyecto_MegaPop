package com.example.proyecto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/megapop")
	public String home() {
		return "home/index.html";
	}

	
}
