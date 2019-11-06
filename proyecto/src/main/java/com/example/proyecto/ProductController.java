package com.example.proyecto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//eSTE COMENTARIO DEBERÁ SER ELIMINADO X SER UNA PRUEBA A gIThUB


@Controller
@RequestMapping("/megapop")
public class ProductController {

	    @Autowired
	   ProductService service;
	    
	    @RequestMapping("/products")
	    public String showProducts (Model model) {	        
	            
	       model.addAttribute("products", service.findAll());
	        
	        return "home/index";
	    }

	      @RequestMapping("/newMedicament")
	    public String newBook() {
	        
	        
	        return "medicaments/newMedicament.html";
	    }   
	    
	/*
	 * @RequestMapping("/insertMedicament") public String insertMedicament
	 * (Medicament medicament, Model model) {
	 * 
	 * service.insertMedicament(medicament);
	 * model.addAttribute("farmacia",service.findAll());
	 * 
	 * return "medicaments/farmacia.html"; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @RequestMapping("/deleteMedicament") public String
	 * deleteMedicament(@RequestParam("medicamentId") String medicamentId, Model
	 * model) {
	 * 
	 * Medicament medicament = new Medicament(medicamentId);
	 * 
	 * service.deleteMedicament(medicament);
	 * model.addAttribute("farmacia",service.findAll());
	 * 
	 * return "medicaments/farmacia.html"; }
	 */
	}

