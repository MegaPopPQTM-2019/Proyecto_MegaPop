package com.example.proyecto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="medicaments")

public class Product {
	@Id
	private String medicamentId;	
	private String name, description,producer, category;
	private double price;
	private long stock_Quantity, stock_In_Order;
	private boolean active;
	
	
	
	
	public String getMedicamentId() {
		return medicamentId;
	}
	public void setMedicamentId(String medicamentId) {
		this.medicamentId = medicamentId;
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
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getStockQuantity() {
		return stock_Quantity;
	}
	public void setStockQuantity(long stockQuantity) {
		this.stock_Quantity = stockQuantity;
	}
	public long getStockInOrder() {
		return stock_In_Order;
	}
	public void setStockInOrder(long stockInOrder) {
		this.stock_In_Order = stockInOrder;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Boolean getActive() {
		
		return this.active;
	}
	
	public Product(String medicamentId) {
        super();
        this.medicamentId = medicamentId;
        
    }
    public Product() {
        super();
    }

}