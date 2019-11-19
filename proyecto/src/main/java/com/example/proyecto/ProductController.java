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
	public String insertProduct(@RequestParam("name") String name,Product product, Model model, HttpSession session) {
		User user = (User) session.getAttribute("sessionuser");		
		product.setUser(user);			
		service.insertProduct(product);
		String email = user.getEmail();
		Iterable<Product> products = service.findbyEmail(email);
		model.addAttribute("userproducts", products);
		
		//AÑADIR COMRPOBACION
		return  "home/profile";
	}
	
	
	
	  @RequestMapping("/viewproducts") 
	  public String showProducts(@RequestParam("category") String category,Model model) {
	  model.addAttribute("categoryproducts", service.findbyCategory(category));
	  return "product/CategoryFilter"; 
	  }
	 
	
	/*
	 * @RequestMapping("/detailproduct") public String detailProduct
	 * (@RequestParam("productid") int id, Model model) {
	 * 
	 * 
	 * Product productOp = service.findbyIdint(id); User user = new
	 * User(service.findbyEmail(productOp.getUser());
	 * 
	 * model.addAttribute("producto",productOp); return "product/detailsproduct"; }
	 */
    
    @GetMapping("/{category}")
    public String categoryVariable(@PathVariable ("category") String category, Model model) {
    	model.addAttribute("categoryproducts", service.findbyCategory(category));
    	return "product/categoryfilter";
    }
    
	/*
	 * @RequestMapping("/findbyID") public String findbyId(@RequestParam
	 * ("productId") int productId, Model model) {
	 * 
	 * service.findbyIdint(productId);
	 * 
	 * model.addAttribute("profileproducts", service.findbyIdint(productId));
	 * 
	 * return "product/detailsproduct"; }
	 * 
	 * @RequestMapping("/product/findbyID") public String
	 * findbyIdcategory(@RequestParam ("productId") int productId, Model model) {
	 * 
	 * service.findbyIdint(productId); model.addAttribute("profileproducts",
	 * service.findbyIdint(productId)); return "product/detailsproduct"; }
	 */
    

    @RequestMapping("/deleteProduct")
    public String deleteProduct(@RequestParam("productId") int productId, Model model) {
        
      Product product= new Product(productId);
        
        service.deleteProduct(product);
        model.addAttribute("userproducts",service.findAll());
        
        return "home/profile";
    }
    
    @RequestMapping("/orderProduct")
    public String orderProduct(@RequestParam("productId") int productId, Model model) {
    	Product product = new Product(productId);
    	service.findbyIdint(productId);
    	product.setOrdered(true);
    	return "product/categoryfilter";
    }
	
	}