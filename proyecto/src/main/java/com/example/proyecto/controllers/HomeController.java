   
package com.example.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.proyecto.services.ProductService;

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
	

	
	@GetMapping("cart")
	public String cart() {
		return "product/cart";
	}
	
	@GetMapping("hlogin")
	public String login() {
		return "home/login";
	}
	@GetMapping("categoryfilter")
	public String categoryfilter() {
		return "product/categoryfilter";
	}
	
	@RequestMapping("/category")
		public String category(@RequestParam ("category") String category, Model model) {
		model.addAttribute("categoryobjects", service.findbyCategory(category)) ;
		return "product/categoryfilter";
	}
}