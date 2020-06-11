package com.stackroute.restaurantspringboot;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@EnableConfigurationProperties
//@EnableAutoConfiguration
public class RestaurantSpringbootApplication extends SpringBootServletInitializer{
	
	private static final Logger log=LoggerFactory.getLogger(RestaurantSpringbootApplication.class);
	
	
	
	//private String dbname=System.getenv("DB_NAME");
	
	//@Value("${DB_NAME}")
	//private String s;
	
	public static void main(String[] args) {
		
		SpringApplication.run(RestaurantSpringbootApplication.class, args);
		
	} 
	
}
