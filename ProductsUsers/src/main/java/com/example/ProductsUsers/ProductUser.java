package com.example.ProductsUsers;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "productUser")
public class ProductUser implements Serializable{
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
	 @ManyToOne
		@JoinColumn
		private Product product;
	 @ManyToOne
		@JoinColumn
		private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	 
}

