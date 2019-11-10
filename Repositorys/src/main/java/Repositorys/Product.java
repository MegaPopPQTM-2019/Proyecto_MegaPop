package Repositorys;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.JoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "description")
    private String description;
    @Column(name = "stockQuantity")
    private long stockQuantity;
	
    @Column(name = "ordered")
    private boolean ordered;
    @Column(name = "sold")
    private boolean sold;
    @Column(name = "fileName")
    private String fileName;
    @Column(name = "fileType")
    private String fileType;
    @Column(name = "fileData")
    private String fileData;
    
    @OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CATEGORY", nullable = false)
	private Set<Category> category;
    
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "USER", nullable = false)
	private User user;



	public Product(int productId, String name, double price, String description, long stockQuantity, boolean ordered,
			boolean sold, String fileName, String fileType, String fileData, Set<Category> category, User user) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockQuantity = stockQuantity;
		this.ordered = ordered;
		this.sold = sold;
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileData = fileData;
		this.category = category;
		this.user = user;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(long stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public boolean isOrdered() {
		return ordered;
	}

	public void setOrdered(boolean ordered) {
		this.ordered = ordered;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileData() {
		return fileData;
	}

	public void setFileData(String fileData) {
		this.fileData = fileData;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


    
  //@OnDelete(action = OnDeleteAction.CASCADE)
    
	
}