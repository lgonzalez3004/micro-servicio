package com.example.productoservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductoServicesApplication.class, args);
	}

}
