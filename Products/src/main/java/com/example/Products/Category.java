package com.example.Products;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Category {
	@Id
	
    private int id;
    @Column(name = "Name")
    private String Name;
    
}