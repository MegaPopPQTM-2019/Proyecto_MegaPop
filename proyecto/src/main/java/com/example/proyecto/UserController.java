package com.example.proyecto;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller

	public class UserController{
	
	@Autowired
	UserService service;
		
	@RequestMapping("/userRegister")
	public String newUser() {
		
		return "register/userRegister.html";
	}
	
	@RequestMapping("/newregister")
	public String insertRegister(User user, Model model) {
		service.insertUser(user);
		model.addAttribute("user", service.findAll());
		
		return "home/profile";
	}

	@GetMapping("/home/login")
	public String showLoginForm (HttpServletRequest request, HttpServletResponse response, Model model) {
		return "/home/login";
	}
	
	@PostMapping ("/home/login")
	public String loginProcess (HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") LoginBean login, HttpSession session) {
		
		User user = UserService.findbyUser(login.getEmail());
		
		if (null != login && user != null && user.getPassword().equals(login.getPassword())) {
			session.setAttribute("user", user);
		} else {
			session.setAttribute("error_userAuthentification", "Username or password is wrong!");
			return "user/login";
		}
		return "redirect:/";
	}
	
	
	}
