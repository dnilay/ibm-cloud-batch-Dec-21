package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//starting point of spring boot application
public class DiscoveryServiceApplication {

	//main method
	public static void main( final String[] args) {
		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}

}
