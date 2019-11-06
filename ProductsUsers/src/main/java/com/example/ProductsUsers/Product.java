package com.example.ProductsUsers;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "product")
public class Product {
	@Id
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "pprice")
	private double price;
	@Column (name = "description")
	private String description;
	@Column (name = "stock")
	private int stock;
	@Column (name="image")
	private String image;
	@Column (name="category")
	private String category;
	@Column (name = "owner")
	private User owner;
	@Column (name="sold")
	private boolean sold;
	
	
	@OneToMany(mappedBy = "products", cascade = CascadeType.ALL)
	private Set<ProductUser> productUser;
}



	

	

	