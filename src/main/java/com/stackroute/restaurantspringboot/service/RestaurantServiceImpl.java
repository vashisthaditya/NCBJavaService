package com.stackroute.restaurantspringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.CannotCreateTransactionException;

import com.stackroute.restaurantspringboot.domain.Restaurant;
import com.stackroute.restaurantspringboot.exception.DatabaseNotAvailableException;
//import com.stackroute.restaurantspringboot.respository.RestaurantRespository;

//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Service
@ConfigurationProperties("static")
public class RestaurantServiceImpl implements RestaurantService {

//	RestaurantRespository resturantRespository;
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	List<Restaurant> tempTable;
	int index;

	@Autowired
	public RestaurantServiceImpl() {

		super();

//		this.resturantRespository = resturantRespository;
		this.tempTable = new ArrayList<Restaurant>();
		this.index = 0;
		Restaurant rest = new Restaurant("Anusha", "Shetty", "Female", "8/01/1991", "Bangalore");
		rest.setId(this.index++);
		this.tempTable.add(rest);

	}

	@Override
	public Restaurant updateResturant(Restaurant resturant) {
//		String sql = "UPDATE RESTAURANT SET name=:item, imageLink=:imageLink, cuizine=:cuizine, review=:review, address=:address WHERE id=:id";
//	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(resturant);
//	 
//	    NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
//	    template.update(sql, param); 
//
//		return resturantRespository.save(resturant);;
		this.tempTable.set(resturant.getId(), resturant);
		return resturant;

	}

	@Override
	public Restaurant addResturant(Restaurant resturant) throws DatabaseNotAvailableException {

		try {

//			 SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
//			    insertActor.withTableName("restaurant").usingColumns("name", "imageLink", "cuizine", "review", "address");
//			    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(resturant);
//			     
//			    insertActor.execute(param); 
//			    return resturant;
			resturant.setId(this.index++);
			this.tempTable.add(resturant);
			return resturant;

		} catch (Exception e) {

			throw new DatabaseNotAvailableException("database is not available");

		}
	}

	@Override
	public Iterable<Restaurant> getList() {
//		String sql = "SELECT * FROM RESTAURANT";
//		 
//	    List<Restaurant> restaurants = jdbcTemplate.query(sql,
//	            BeanPropertyRowMapper.newInstance(Restaurant.class));
//
//		return restaurants;

		return this.tempTable;
	}

	@Override
	public Restaurant deleteResturant(Restaurant resturant) {

//		String sql = "DELETE FROM RESTAURANT WHERE id = ?";
//	    jdbcTemplate.update(sql, resturant.getId());
//
//		return resturant;
		this.index--;
		this.tempTable.remove(resturant.getId());
		for(int i=0;i<this.tempTable.size();i++) {
			Restaurant r= this.tempTable.get(i);
			r.setId(i);
			this.tempTable.set(i, r);
		}
		return resturant;

	}

	@Override
	public Restaurant findResturantUsingId(Restaurant resturant) {
//		 String sql = "SELECT * FROM RESTAURANT WHERE id = ?";
//		    Object[] args = {resturant.getId()};
//		    Restaurant restaurantResult = jdbcTemplate.queryForObject(sql, args,
//		                    BeanPropertyRowMapper.newInstance(Restaurant.class));
//
//		return restaurantResult;
		return this.tempTable.get(resturant.getId());

	}

	@Override
	public Restaurant findResturantUsingname(Restaurant resturant) {

//		String sql = "SELECT * FROM RESTAURANT WHERE name = ?";
//	    Object[] args = {resturant.getName()};
//	    Restaurant restaurantResult = jdbcTemplate.queryForObject(sql, args,
//	                    BeanPropertyRowMapper.newInstance(Restaurant.class));

	return resturant;

	}

//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		// TODO Auto-generated method stub
//		addResturant(new Restaurant("Taj", "taj-hotel.jpg", "indian", "good", "mumbai"));
//	}
//	
//	@EventListener
//    public void seed(ContextRefreshedEvent event) throws Exception {
//
//	    seedUsersTable();
//
//	}
//
//	private void seedUsersTable() throws Exception{
//		// TODO Auto-generated method stub
//		addResturant(new Restaurant("Sonar Bangla", "sonarbangla-hotel", "Bengali", "good", "Kolkata"));
//	}

}
