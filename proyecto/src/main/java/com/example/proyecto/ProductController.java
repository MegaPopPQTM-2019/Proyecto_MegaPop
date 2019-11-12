package com.example.proyecto;

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
	public String insertProduct(Product product, Model model) {
		service.insertProduct(product);
		model.addAttribute("productos", service.findAll());
		//AÑADIR COMRPOBACION
		return "product/category";
	}

	
	}

		
