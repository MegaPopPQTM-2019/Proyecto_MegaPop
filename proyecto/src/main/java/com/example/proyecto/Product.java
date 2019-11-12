package com.example.proyecto;


import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.JoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
	
	@Column(name = "name")
    private String name;
	@Column(name = "description")
    private String description;
	@Column(name = "stockQuantity")
    private int stockQuantity;
	@Column(name = "price")
    private double price;
	@Column(name = "ordered")
    private boolean ordered;
	@Column(name = "sold")
private boolean sold;
	@Column(name = "photo")
    private Blob photo;  
    
    
    
    @OneToMany(mappedBy = "product",  cascade = CascadeType.ALL)
	private Set<UserProduct> userProducts = new HashSet<>();



	public Product(String name) {
		super();
		this.name=name;
	}
	
	
	
	public Product(String name, String description, int stockQuantity, double price,  Blob photo, User user) {
		super();		
		this.name = name;
		this.description = description;
		this.stockQuantity = stockQuantity;
		this.price = price;
		this.ordered = false;
		this.sold = false;
		this.photo = photo;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getStockQuantity() {
		return stockQuantity;
	}



	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public boolean isOrdered() {
		return ordered;
	}



	public void setOrdered(boolean ordered) {
		this.ordered = ordered;
	}



	public boolean isSold() {
		return sold;
	}



	public void setSold(boolean sold) {
		this.sold = sold;
	}



	public Blob getPhoto() {
		return photo;
	}



	public void setPhoto(Blob photo) {
		this.photo = photo;
	}







    
  //@OnDelete(action = OnDeleteAction.CASCADE)
    
	
}