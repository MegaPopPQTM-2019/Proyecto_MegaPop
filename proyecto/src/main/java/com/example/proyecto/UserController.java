package com.example.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

	public class UserController {
	
	@Autowired
	UserService service;
		
	@RequestMapping("/userRegister")
	public String newUser() {
		
		return "register/userRegister.html";
	}
	
	@RequestMapping("/register")
	public String insertRegister(User user, Model model) {
		service.insertUser(user);
		model.addAttribute("usuarios", service.findAll());
		
		return "home/Profile";
	}
	@RequestMapping("/login")
	public String profile(String email, String password, Model model) {
		service.findbyId(email);
	}
	
	}

		
