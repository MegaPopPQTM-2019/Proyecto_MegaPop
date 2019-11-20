package com.example.proyecto.models;


import java.sql.Blob;
import java.util.List;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.tomcat.util.codec.binary.Base64;

import lombok.Data;

@Data
@Entity
@Table (name="users")
public class User {
	
	@Id	   
	private String email;	
	@Column(name="firstname")	
	private String firstname; 
	@Column(name="lastname")
	private String lastname;
	@Column(name="phone")
	private String phone;
	@Column(name="address")
	private String address;
	@Column(name="zip")
	private String zip;
	@Column(name="city")
	private String city;
	@Column(name="country")
	private String country;
	@Column(name="password")
	private String password;
	@Column(name="confpassword")
	private String confpassword;
	
	@Column(name="image")
	@Lob
	private Blob image;
	
	
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="email")
	
	private List<Product> products;
	
	/*
	 * @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) private
	 * Set<UserProduct> userProducts ; = new HashSet<>();
	 */

	
    public User() {
    	super();
    }

   
    public User(String email) {
    	super();
    	this.email = email;
    	
    }

    public List<Product> getproducts(){
    	return products;
    }
    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
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

	public String getConfpassword() {
		return confpassword;
	}

	public void setConfpassword(String confpassword) {
		this.confpassword = confpassword;
	}

	@Override
	public String toString() {
		return "User email=" + email ;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}



    //getters y setters


	
    


    

    
   
}