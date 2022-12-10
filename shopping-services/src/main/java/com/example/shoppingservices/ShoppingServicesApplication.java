package com.example.shoppingservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingServicesApplication.class, args);
	}

}
