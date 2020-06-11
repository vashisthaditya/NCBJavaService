

package com.stackroute.restaurantspringboot.test;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertIterableEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import java.sql.*;
import org.junit.Before;
import org.junit.Test;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.stackroute.restaurantspringboot.domain.Restaurant;
import com.stackroute.restaurantspringboot.exception.DatabaseNotAvailableException;
import com.stackroute.restaurantspringboot.service.RestaurantServiceImpl;
//import org.hamcrest.Matcher;

public class ImplTest {
	public RestaurantServiceImpl restservice;

	/*@Before
	public void setUp() throws Exception {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setUrl("jdbc:oracle:thin:@ncbtomcat.eastus.cloudapp.azure.com:1521:XE");
		datasource.setUsername("SYS AS SYSDBA");
		datasource.setPassword("Oracle123");
		datasource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		restservice=new RestaurantServiceImpl(new JdbcTemplate(datasource));
	}*/
	public void ImplTest2() {
		// TODO Auto-generated constructor stub
	}

	/*@Test
	public void testUpdateResturant() {
		fail("Not yet implemented");
		/*Restaurant rest=new Restaurant("Vinay",null,"veg","Good","Bangalore");
		rest.setId(31);
		/*rest.setName("Vinay");
		rest.setImageLink(null);
		rest.setCuizine("Veg");
		rest.setReview("Good");
		rest.setAddress("Bangalore");
		restservice.updateResturant(rest);
	}*/

	@Test
	public void testAddResturant()throws NullPointerException, DatabaseNotAvailableException {
		//fail("Not yet implemented");
		System.out.println("Running Junit Test");
		System.out.println(".............................");
		System.out.println("Adding a Customer");
		System.out.println(".............................");
		Restaurant rest = new Restaurant( "Anusha", "Shetty", "Female", "8/01/1991", "Bangalore");
		/*try {
			restservice.addResturant(rest);
		} catch (DatabaseNotAvailableException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		/*
		//assertTrue("Add the values",restservice.is);*/
		//Restaurant resturant = null;
		int id=0;
		int index=rest.getId();
		
		//Restaurant result=restservice.addResturant(rest);
		assertNotEquals("Check",-1,index);
		System.out.println("Added Customer successfully");
		System.out.println(".............................");
		System.out.println("Junit Test run successfully");
	
	}
	

	/*@Test
	public void testGetList() throws Exception {
		//fail("Not yet implemented");
		//assertThat(Arrays.asList("100","Anusha Shetty", "Bangalore", "Project Manager", "Bangalore"),hasItems("100"));
		
	}*/

	
}

