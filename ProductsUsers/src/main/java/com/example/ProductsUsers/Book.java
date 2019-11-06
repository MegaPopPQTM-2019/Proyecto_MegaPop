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
@Table(name = "books")
public class Book {
	@Id
	private String title;
	@Column(name = "isbn")
	private String ISBN;
	@Column(name = "pages")
	private int pages;
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private Set<BookAuthor> bookAuthors;

	public Book() {}

	public Book(String title, String isbn, int pages, BookAuthor... bookAuthors) {
		this.title = title;
		this.ISBN = isbn;
		this.pages = pages;
		for (BookAuthor bookAuthor : bookAuthors) bookAuthor.setBook(this);
		this.bookAuthors = Stream.of(bookAuthors).collect(Collectors.toSet());			
	}}