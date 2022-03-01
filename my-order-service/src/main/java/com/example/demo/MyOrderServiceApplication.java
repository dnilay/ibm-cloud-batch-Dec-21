package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MyOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyOrderServiceApplication.class, args);
	}
	
	@Bean
	@Primary
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
