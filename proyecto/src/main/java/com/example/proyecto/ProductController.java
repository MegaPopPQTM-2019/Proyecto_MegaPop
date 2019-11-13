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
		User user = (User) session.getAttribute("sessionuser");
		//System.out.println(product);
		//System.out.println(user);
		product.setUser(user);
		
		service.insertProduct(product);
		//model.addAttribute("productos", service.findAll());
		//AÑADIR COMRPOBACION
		return "home/profile";
	}
	
	//CUANDO SELECCIONEMOS CATEGORIA EN EL INDEX LLAMAREMOS A ESTA FUNCION QUE FILTRARA LOS PRODUCTOS POR SU CATEGORY
	/*
	 * @RequestMapping("/viewproducts") public String showProducts() {
	 * model.addAttribute("categoryproducts", service.findbyCategory()); return
	 * "product/CategoryFilter"; }
	 */
	
	}