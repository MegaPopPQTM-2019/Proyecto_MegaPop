package com.example.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
	
}