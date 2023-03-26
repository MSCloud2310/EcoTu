package com.example.ecotuAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EcotuApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcotuApiApplication.class, args);
	}

}
