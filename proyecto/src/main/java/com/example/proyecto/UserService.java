package com.example.proyecto;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService{

	@Autowired
	static	
	UserRepository repository;
	
	
	public List<User> findAll() {
		
		return (List<User>)repository.findAll();
	}
	
	public void insertUser(User user) {
		
		repository.save(user);
	}
	
	public static User findbyUser(String user) {
		return repository.findById(user).orElse(null);
	}

}