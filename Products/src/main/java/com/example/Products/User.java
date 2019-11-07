package com.example.Products;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "users")
public class User {
	@Id
	
    private String email;
    @Column(name = "firtName")
    private String firtName;
    @Column(name = "lasttName")
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
    @ManyToMany(mappedBy = "users", cascade = CascadeType.ALL)
}