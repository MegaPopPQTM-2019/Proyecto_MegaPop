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
import javax.servlet.http.HttpSession;

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
	@Column(name = "stockquantity")
    private int stockquantity;
	@Column(name = "category")
    private String category;
	@Column(name = "price")
    private double price;
	@Column(name = "ordered")
    private boolean ordered;
	@Column(name = "sold")
	private boolean sold;	
	@Column(name = "photo")
	private Blob photo;
	 
    
	@ManyToOne
	@JoinColumn(name="email")
	private User email;
	
   
	/*@OneToMany(mappedBy = "product",  cascade = CascadeType.ALL)
	private Set<UserProduct> userProducts = new HashSet<>();*/



	public Product() {
		super();
	}
	
	public Product(String name) {
		super();
		this.name=name;
	}
	
	
	
	public Product(String name, String description, int stockquantity, double price) {
		super();		
		this.name = name;
		this.description = description;
		this.stockquantity = stockquantity;
		//NO RECIBE LA CATEGORIA PONEMOS HOME PARA PROBAR
		this.category = "home";
		this.price = price;
		//TODAVIA NO USAREMOS ESTOS CAMPOS, SON PARA LA GESTION DE VENTAS
		this.ordered = false;
		this.sold = false;
		/* this.photo = photo; */
		//USUARIO NULL HASTA QUE PODAMOS RELACIONARLO CON SESSION
		this.email = null;
				//session.getAttribute(sessionuser); 

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



	public int getStockquantity() {
		return stockquantity;
	}



	public void setStockQuantity(int stockquantity) {
		this.stockquantity = stockquantity;
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

	
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public User getUser() {
		return email;
	}

	public void setUser(User user) {
		this.email = user;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description
				+ ", stockQuantity=" + stockquantity + ", category=" + category + ", price=" + price + ", ordered="
				+ ordered + ", sold=" + sold + ", user=" + email + "]";
	}



	
	  public Blob getPhoto() { return photo; }
	  
	  
	  
	  public void setPhoto(Blob photo) { this.photo = photo; }
	 






    
  //@OnDelete(action = OnDeleteAction.CASCADE)
    
	
}