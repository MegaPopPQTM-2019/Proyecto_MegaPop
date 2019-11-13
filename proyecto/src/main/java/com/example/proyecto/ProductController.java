package com.example.proyecto;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

	public class ProductController {
	
	@Autowired
	ProductService service;
		
	@RequestMapping("/newproduct")
	public String newProduct() {
		
		return "product/newProduct";
	}
	
	@RequestMapping("/addproduct")
	public String insertProduct(Product product, Model model, HttpSession session) {
		service.insertProduct(product);
		model.addAttribute("productos", service.findAll());	
		session.setAttribute("sessionproduct", product);
		//AÑADIR COMRPOBACION
		return "product/detailsproduct";
	}
	
	

	
	}