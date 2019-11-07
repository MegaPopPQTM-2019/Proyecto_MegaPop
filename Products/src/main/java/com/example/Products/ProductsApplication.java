package com.example.Products;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}



	@Override
	public void run(String... args) {

		bookRepository.save(new Book("Thinking in Java", "3245-EW", 1215, new Author("Bruce Eckel", "Germany"),
				new Author("Eric Steven Raymond", "England")));
		
		bookRepository.save(new Book("Thinking in C++", "5445-RT", 1215, new Author("Bruce Eckel", "Germany"),
				new Author("Bjarne Stroustrup", "England")));
		
		bookRepository.save(new Book("Java Concurrency in Practice", "1132-YT", 1215, new Author("Goetz Brian", "Germany"),
				new Author("Peierls Tim", "England"),new Author("Bjarne Stroustrup", "England")));
	
	// Book book1 = new Book("Thinking in JS", "3245-JS", 15);
	// bookRepository.save(book1);	
		
	}

}