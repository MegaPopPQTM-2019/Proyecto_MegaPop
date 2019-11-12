package com.example.proyecto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.JoinColumn;

@Data
@Entity
@Table(name = "userProducts")
public class UserProduct implements Serializable {
     
	@Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;
		
	@ManyToOne
	@JoinColumn
	private User user;
	
	@ManyToOne
	@JoinColumn
	private Product product;

	public UserProduct(int id, User user, Product product) {
		super();
		this.id = id;
		this.user = user;
		this.product = product;
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	


	





	
		
	}