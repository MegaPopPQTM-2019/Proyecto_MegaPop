package com.example.proyecto;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		product.setUser(user);
		
		service.insertProduct(product);
		model.addAttribute("userproducts", product);
		
		//AÑADIR COMRPOBACION
		return  "home/profile";
	}
	
	
	
	  @RequestMapping("/viewproducts") 
	  public String showProducts(@RequestParam("category") String category,Model model) {
	  model.addAttribute("categoryproducts", service.findbyCategory(category));
	  return "product/CategoryFilter"; 
	  }
	 
	
    @RequestMapping("/detailproduct")
	public String detailProduct (@RequestParam("productid") int id, Model model) {
		
    	
		Product productOp = service.findbyIdint(id);
		
			
		model.addAttribute("producto",productOp);
		return "product/detailsproduct";
	}
    
    @GetMapping("/product/{category}")
    public String categoryVariable(@PathVariable ("category") String category, Model model) {
    	model.addAttribute("categoryproducts", service.findbyCategory(category));
    	return "product/CategoryFilter";
    }
	
	}