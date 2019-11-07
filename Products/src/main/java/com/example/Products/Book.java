package com.example.Products;

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
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = "authors")

@Entity
@Table(name = "books")
public class Book {
	@Id
	private String title;
	@Column(name = "isbn")
	private String ISBN;
	@Column(name = "pages")
	private int pages;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "book_author", 
	joinColumns = @JoinColumn(name = "titleId", referencedColumnName = "title"), 
	inverseJoinColumns = @JoinColumn(name = "nameId", referencedColumnName = "name"))
	private Set<Author> authors;
	
	


	public Book() {
		super();
	}

	public Book(String title, String isbn, int pages, Author... authors) {
        this.title = title;
        this.ISBN = isbn;
        this.pages = pages;
        this.authors = Stream.of(authors).collect(Collectors.toSet());
        this.authors.forEach(x -> x.getBooks().add(this));
    }
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String Title) {
		this.title = Title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Book(String title, String ISBN, int pages) {
		super();
		this.title = title;
		this.ISBN = ISBN;
		this.pages = pages;
	}

	public Book(String title) {
		super();
		this.title = title;

	}}