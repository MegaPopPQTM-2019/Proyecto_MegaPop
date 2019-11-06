package com.example.ProductsUsers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import java.util.Arrays;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProductsUsersApplication implements CommandLineRunner {

    @Autowired private  BookRepository bookRepository;
    @Autowired private  AuthorRepository authorRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductsUsersApplication.class, args);
	}



	@Override
	public void run(String... args) {

Author author1 = new Author ("Bruce Eckel", "Germany");
Author author2 = new Author ("Goetz Brian", "Germany");
Author author3 = new Author ("Peierls Tim", "England");

authorRepository.saveAll(Arrays.asList(author1 ,author2, author3));


bookRepository.save(new Book("Thinking in Java", "3245-EW", 1215, new BookAuthor(author1, "6th"),new BookAuthor(author2, "6th"), new BookAuthor(author3, "6th")));

bookRepository.save(new Book("Thinking in C++", "3894-EW", 155, new BookAuthor(author1, "4th")));
				
						
	}

}