
package com.example.proyecto.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.models.User;
import com.example.proyecto.repositorys.UserRepository;


@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	
	public Iterable<User> findAll() {
		
		return repository.findAll();
	}
	
	public void insertUser(User user) {
		
		repository.save(user);
	}
	
	public User findbyId(String email){
		return repository.findById(email).orElse(null);
	}
	
	


}