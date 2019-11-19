package com.example.proyecto.apirest;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.models.Product;
import com.example.proyecto.repositorys.ProductRepository;

@RestController
@RequestMapping("/webapi")

public class ProductRestController {

	
	@Autowired
	ProductRepository repository;
	
	@PostMapping(path = "/products", consumes = "application/json")
	public void insertProduct(@RequestBody Product product) {

		repository.save(product);
	}
	
	@GetMapping("/products/{email}")
	public ResponseEntity<byte[]> findImage (@PathVariable("email") String email) throws SQLException {

		Optional<Product> product = repository.findbyIEmail(email);
		byte[] imageBytes = null;
		if (product.isPresent()) {
			
			imageBytes= product.get().getPhoto().getBytes(1,(int)product.get().getPhoto().length());
		}

		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
	}
	

}
