
  package Repositorys;
  
  import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType; 
  import javax.persistence.Column; 
  import javax.persistence.Entity;
  import javax.persistence.FetchType;
  import javax.persistence.GeneratedValue; 
  import javax.persistence.GenerationType;
  import javax.persistence.Id; 
  import javax.persistence.ManyToOne; 
  import javax.persistence.OneToMany; 
  import javax.persistence.Table;
  import antlr.collections.List; 
  import lombok.Data;
  
    @Data
  @Entity
  @Table(name = "users") 
  public class User {
  @Id
  private String email;
  
  @Column(name = "firstName") 
  private String firstName;
  
  @Column(name = "lastName") 
  private String lastName;
  
  @Column(name = "phoneNumber")
  private String phoneNumber;
  
  @Column(name = "address") 
  private String address;
  
  @Column(name = "codePostal")
  private String codePostal;
  
  @Column(name = "city") 
  private String city;
  
  @Column(name = "country") 
  private String country;
  
  @Column(name = "password") 
  private String password;
  
  @Column(name = "fileName")
  private String fileName;
  
  @Column(name = "fileType") 
  private String fileType;
  
  @Column(name = "fileData") 
  private String fileData;

public User(String email, String firstName, String lastName, String phoneNumber, String address, String codePostal,
		String city, String country, String password, String fileName, String fileType, String fileData) {
	super();
	this.email = email;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.codePostal = codePostal;
	this.city = city;
	this.country = country;
	this.password = password;
	this.fileName = fileName;
	this.fileType = fileType;
	this.fileData = fileData;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCodePostal() {
	return codePostal;
}

public void setCodePostal(String codePostal) {
	this.codePostal = codePostal;
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
  

  }
 