package com.example.proyecto;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

	public class UserController {
	
	@Autowired
	UserService service;
		
	@RequestMapping("/userRegister")
	public String newUser() {
		
		return "register/userRegister.html";
	}
	
	@RequestMapping("/register")
	public String insertRegister(HttpSession session,User user, Model model) {
		service.insertUser(user);
		model.addAttribute("usuarios", service.findAll());
		session.setAttribute("sessionuser", user);
		//AÑADIR COMRPOBACION
		return "home/profile";
	}
	@RequestMapping("/login")
	public String profile(HttpSession session, @RequestParam("email")String email, @RequestParam("password") String password, Model model) {
		User user = service.findbyId(email);
		if(null != user && user.getPassword().contentEquals(password)) {
			model.addAttribute("userLogin", user);
			session.setAttribute("sessionuser", user);
			return "home/profile";
		}else {
			return "home/login";
		}
		
	}
	
	}