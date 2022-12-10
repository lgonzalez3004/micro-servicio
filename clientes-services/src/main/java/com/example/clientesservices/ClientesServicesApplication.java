package com.example.clientesservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientesServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientesServicesApplication.class, args);
	}

}
