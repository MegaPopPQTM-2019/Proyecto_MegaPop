
package com.example.proyecto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.models.Product;
import com.example.proyecto.repositorys.ProductRepository;




@Service
public class ProductService {

	@Autowired
	ProductRepository repository;
	
	
	public Iterable<Product> findAll() {
		
		return repository.findAll();
	}
	
	public void insertProduct(Product product) {
		
		repository.save(product);
	}
	public Product findbyIdint(int id){
		return repository.findbyIdint(id);
	}
	
	public Iterable<Product> findbyCategory(String category){
		return repository.findbyCategory(category);		
	}
	
	public Iterable<Product> findbyEmail (String email){
		
		return repository.findbyEmail(email);
	}
	
	 public void deleteProduct(Product product) {
	        
	        repository.delete(product);
	    }
	}
