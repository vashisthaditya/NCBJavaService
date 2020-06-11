package com.stackroute.restaurantspringboot.domain;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Indexed;

public class Restaurant {
	
	private int id;
	
	private String name;
	
	private String lname; //imageLink
	
	private String gender; //cuizine
	
	private String dob; //review
	
	private String address;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	
	public Restaurant(String name,String lname,String gender,String dob,String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.lname=lname;
		this.gender=gender;
		this.dob=dob;
		this.address=address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		
		this.address = address;
		
	}

	public int getId() {
		
		return id;
		
	}

	public void setId(int id) {
		
		this.id = id;
	
	}

	public String getName() {
	
		return name;
	
	}

	public void setName(String name) {
	
		this.name = name;
	
	}

	public String getLname() {
	
		return lname;
	
	}

	public void setLname(String lname) {
	
		this.lname = lname;
	
	}

	public String getGender() {
	
		return gender;
	
	}

	public void setGender(String gender) {
	
		this.gender = gender;
	
	}

	public String getDOB() {
	
		return dob;
	
	}

	public void setDOB(String dob) {
	
		this.dob = dob;
	
	}

}
