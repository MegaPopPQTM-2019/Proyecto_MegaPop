package com.example.Products;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.*;

@Data
@Entity
@Table(name = "authors")
public class Author {
	@Id
	private String name;
	@Column(name = "country")
	private String country;

	@ManyToMany(mappedBy = "authors")
	private Set<Book> books = new HashSet<>();

	
	

	public Author() {
		super();
	}

	public Author(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

}