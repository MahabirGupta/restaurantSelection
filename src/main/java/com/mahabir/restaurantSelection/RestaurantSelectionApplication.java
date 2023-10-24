package com.mahabir.restaurantSelection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class RestaurantSelectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantSelectionApplication.class, args);
	}

}
