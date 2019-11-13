package com.example.proyecto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/megapop")
	public String home() {	
		
		return "home/index.html";
	}

	@GetMapping("register")
	public String userRegister() {
		return "register/userRegister";
	}
	
	@GetMapping("megapop")
	public String index() {
		return "home/index.html";
	}
	
	@GetMapping("cart")
	public String cart() {
		return "product/cart";
	}

}