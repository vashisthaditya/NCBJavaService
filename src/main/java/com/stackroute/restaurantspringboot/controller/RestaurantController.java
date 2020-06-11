package com.stackroute.restaurantspringboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.restaurantspringboot.domain.Restaurant;
import com.stackroute.restaurantspringboot.exception.MyException;
import com.stackroute.restaurantspringboot.service.RestaurantService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@SuppressWarnings("rawtypes")
@RequestMapping("api/v1")
@RestController
@CrossOrigin("*")
@Api(value = "ResturantControllerApi", produces = MediaType.APPLICATION_JSON_VALUE)
public class RestaurantController {

	RestaurantService resturantService;

	public RestaurantController(RestaurantService resturantService) {
		
		this.resturantService = resturantService;
		
	}
//        @Timed(value = "addResturant()", histogram = true, percentiles = { 0.95 }, extraTags = {"version", "1.0" })
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/customer")
	public ResponseEntity<Restaurant> addResturant(@RequestBody Restaurant resturant) throws Exception {
		
//		if (resturant.getName().length() <= 2) {
//			
//			throw new MyException("name length is should be more than 2");
//			
//		}
		
		// ExceptionThrower exceptionThrower = new ExceptionThrower();
		
		// exceptionThrower.throwGeneralException();
		
		// exceptionThrower.throwCustomException();
		
		Logger log= LoggerFactory.getLogger(RestaurantController.class);

		
		Restaurant resturant1 = resturantService.addResturant(resturant);
		
		log.info("restaurant save");
		
		return new ResponseEntity<Restaurant>(resturant1, HttpStatus.OK);
		
	}
//        @Timed(value = "deleteResturantUsingId", histogram = true, percentiles = { 0.95 }, extraTags = {"version", "1.0" })
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<Restaurant> deleteResturantUsingId(Restaurant resturant) {

		Restaurant resturant1 = resturantService.deleteResturant(resturant);
		
		return new ResponseEntity<Restaurant>(resturant1, HttpStatus.OK);
		
	}
//        @Timed(value = "findResturantById", histogram = true, percentiles = { 0.95 }, extraTags = {"version", "1.0" })
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/customer/{id}")
	@ApiOperation("get the resturant with specific id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "ok", response = Restaurant.class) })
	public ResponseEntity<Restaurant> findResturantById(Restaurant resturant, @PathVariable("id") String id) {
		
		resturant.setId(Integer.parseInt(id));
		
		Restaurant resturant1 = resturantService.findResturantUsingId(resturant);
		
		return new ResponseEntity<Restaurant>(resturant1, HttpStatus.OK);
		
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/customer/{id}/{name}")
	public ResponseEntity<Restaurant> findResturantByName(Restaurant resturant, @PathVariable("name") String name) {
		
		resturant.setName(name);
		
		Restaurant resturant1 = resturantService.findResturantUsingId(resturant);
		
		return new ResponseEntity<Restaurant>(resturant1, HttpStatus.OK);
		
	}
//        @Timed(value = "updateResturantUsingId()", histogram = true, percentiles = { 0.95 }, extraTags = {"version", "1.0" })
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/customer/{id}")
	public ResponseEntity<Restaurant> updateResturantUsingId(@RequestBody Restaurant resturant, @PathVariable("id") String id) {
		
		resturant.setId(Integer.parseInt(id));
		
		Restaurant resturant1 = resturantService.updateResturant(resturant);
		
		return new ResponseEntity<Restaurant>(resturant1, HttpStatus.OK);
		
	}
//        @Timed(value = "getAllResturant()", histogram = true, percentiles = { 0.95 }, extraTags = {"version", "1.0" })
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/customer")
	public ResponseEntity getAllResturant() {

		Iterable<Restaurant> resturant1 = resturantService.getList();
		
		return new ResponseEntity<>(resturant1, HttpStatus.OK);
		
	}

}
