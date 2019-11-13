package com.example.proyecto;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/webapi")

public class UserRestController {

	
	@Autowired
	UserRepository repository;
	
	@PostMapping(path = "/users", consumes = "application/json")
	public void insertBook(@RequestBody User user) {

		repository.save(user);
	}
	
	@GetMapping("/user/{email}")
	public ResponseEntity<byte[]> findImage (@PathVariable("email") String email) throws SQLException {

		Optional<User> user = repository.findById(email);
		byte[] imageBytes = null;
		if (user.isPresent()) {
			
			imageBytes = user.get().getImage();
		}

		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
	}

}


