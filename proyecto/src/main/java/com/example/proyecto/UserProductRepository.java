  
package com.example.proyecto;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserProductRepository extends JpaRepository<UserProduct,Integer>{

}