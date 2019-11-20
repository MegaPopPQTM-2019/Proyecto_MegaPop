package com.example.proyecto.apirest;

import java.sql.SQLException;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.models.User;
import com.example.proyecto.repositorys.UserRepository;

import org.springframework.http.MediaType;

@RestController
@RequestMapping("/webapi")

public class UserRestController {

	
	@Autowired
	UserRepository repository;
	
	@PostMapping(path = "/users", consumes = "application/json")
	public void insertUser(@RequestBody User user) {

		repository.save(user);
	}
	
	@RequestMapping(value="/user/{email}", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE)
	public ResponseEntity findImage (@PathVariable("email") String email, HttpServletResponse response) {

		Optional<User> user = repository.findById(email);
		byte[] imageBytes = user.get().getImage();
		
		response.setContentType(MediaType.IMAGE_JPEG_VALUE);

		return ResponseEntity.ok(imageBytes);
	}
	

}


