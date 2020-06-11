package com.stackroute.restaurantspringboot.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//
//import com.mongodb.MongoClient;
//
//@EnableMongoRepositories
public class MongoDBConfig {
    @Value("${mongo.db.url}")
    private String MONGO_DB_URL;

    @Value(("${mongo.db.port:27017}"))
    private int MONGO_DB_PORT;

    @Value("${mongo.db.name}")
    private String MONGO_DB_NAME;

//    @Bean
//    public MongoTemplate mongoTemplate() {
//        MongoClient mongoClient = new MongoClient(MONGO_DB_URL, MONGO_DB_PORT);
//        MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, MONGO_DB_NAME);
//        return mongoTemplate;
//    }
}
