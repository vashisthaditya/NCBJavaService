package com.stackroute.restaurantspringboot.respository;


//import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackroute.restaurantspringboot.domain.Restaurant;

public interface RestaurantRespository {

	public Restaurant findByName(String name);
	
}
