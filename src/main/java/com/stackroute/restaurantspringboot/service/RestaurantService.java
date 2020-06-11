package com.stackroute.restaurantspringboot.service;

import com.stackroute.restaurantspringboot.domain.Restaurant;
import com.stackroute.restaurantspringboot.exception.DatabaseNotAvailableException;

public interface RestaurantService {
	public Restaurant updateResturant(Restaurant resturant);

	public Restaurant addResturant(Restaurant resturant) throws DatabaseNotAvailableException;

	public Iterable<Restaurant> getList();

	public Restaurant deleteResturant(Restaurant resturant);

	public Restaurant findResturantUsingId(Restaurant resturant);

	public Restaurant findResturantUsingname(Restaurant resturant);
	
	
}
