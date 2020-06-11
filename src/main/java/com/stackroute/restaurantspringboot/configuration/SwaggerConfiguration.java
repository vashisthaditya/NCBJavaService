package com.stackroute.restaurantspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.stackroute.restaurantspringboot.controller.RestaurantController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@PropertySource("classpath:swagger.properties")
@ComponentScan(basePackageClasses = RestaurantController.class)
@Configuration
public class SwaggerConfiguration {
	
	public static final String SWAGGER_API_VERSION = "1.0";
	
	public static final String LICENSE = "license";
	
	public static final String title = "Resturant REST API";
	
	public static final String description = "Restful API for Resturant";

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(title).description(description).license(LICENSE).version(SWAGGER_API_VERSION)
				.build();
	}

	@Bean
	public Docket resturantApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).pathMapping("/").select()
				.paths(PathSelectors.regex("/api/vi.*")).build();
	}
}
