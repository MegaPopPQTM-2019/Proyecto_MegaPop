package com.example.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@Autowired
	ProductService service;
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
	
	@GetMapping("category")
		public String category(@RequestParam ("category") String category, Model model) {
		model.addAttribute("categoryobjects", service.findbyCategory(category)) ;
		return "product/categoryfilter";
	}
}