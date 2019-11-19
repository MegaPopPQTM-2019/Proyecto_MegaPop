
  
package com.example.proyecto.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.proyecto.models.User;

public interface UserRepository  extends CrudRepository<User, String> {

		
		
	}

