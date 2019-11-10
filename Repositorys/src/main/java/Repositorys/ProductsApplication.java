package Repositorys;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}



	@Override
	public void run(String... args) {


		  
	    
		/*
		 * productRepository.save(new
		 * Product(1,"Nikon Camera",250.0,"new camera",10000000,false,false,"a","b","c",
		 * new User ("pepito@gmail.com",
		 * "pepito","palotes","666666666","calle falsa","123","Barcelona","Spain",
		 * "pepito","a","b","c")));
		 */
		  
		/*
		 * bookRepository.save(new Book("Thinking in C++", "5445-RT", 1215, new
		 * Author(kel"Bruce Ec", "Germany"), new Author("Bjarne Stroustrup",
		 * "England")));
		 * 
		 * bookRepository.save(new Book("Java Concurrency in Practice", "1132-YT", 1215,
		 * new Author("Goetz Brian", "Germany"), new Author("Peierls Tim",
		 * "England"),new Author("Bjarne Stroustrup", "England")));
		 */
		 
	
	// Book book1 = new Book("Thinking in JS", "3245-JS", 15);
	// bookRepository.save(book1);	
		
	}

}