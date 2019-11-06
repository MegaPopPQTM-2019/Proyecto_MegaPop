package com.example.ProductsUsers;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

@Data
@Entity
@Table(name = "user")
public class User {
	@Id
	private String email;
	@Column(name = "name")
	private String name;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "phone")
	private String phone;
	@Column(name = "address")
	private String address;
	@Column(name = "zip")
	private String zip;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;
	@Column(name = "password")
	private String password;
	@Column(name = "photo")
	private String photo;
	
	
	@OneToMany(mappedBy = "user",  cascade = CascadeType.ALL)
	private Set<ProductUser> productUsers = new HashSet<>();
}



public User(String email, String name, String lastname, String phone, String address, String zip, String city, String country, String password, String photo, ProductUser ... productUsers) {
	this.email = email;
	this.name = name;
	this.lastname = lastname;
	this.phone = phone;
	this.address = address;
	this.zip = zip;
	this.city = city;
	this.country = country;
	this.password = password;
	this.photo= photo;
	
	for (ProductUser productUser : productUsers) productUser.setUser(this);
	this.productUser = Stream.of(productUsers).collect(Collectors.toSet());			
}}

	

	
	

	public Author() {
		super();
	}

	public Author(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Set<BookAuthor> getBookAuthors() {
		return bookAuthors;
	}

	public void setBookAuthors(Set<BookAuthor> bookAuthors) {
		this.bookAuthors = bookAuthors;
	}
	
	