package com.registration.capstoneproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_TBL")
public class Customer {

	@Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
	 private String gender; 
	 private String mobileNo; 
	 private String email; 
	 private String address; 
	 private String password; 
	 private String country;
	 private String state; 
	 private String city; 
	 private String pincode;
}
