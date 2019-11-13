
package com.example.proyecto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository  extends CrudRepository<Product, String> {
	@Query("select u from products u where u.Category = ?1")
	public Iterable<Product> findbyCategory(String category);
}