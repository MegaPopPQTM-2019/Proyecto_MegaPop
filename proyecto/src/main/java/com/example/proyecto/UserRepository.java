
  
package com.example.proyecto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, String> {

		
		
	}

