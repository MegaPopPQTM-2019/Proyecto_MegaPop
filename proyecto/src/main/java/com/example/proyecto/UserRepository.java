package com.example.proyecto;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,String> {

}