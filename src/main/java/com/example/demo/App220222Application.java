package com.example.demo;

import com.example.demo.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class App220222Application {

    public static void main(String[] args) {
        SpringApplication.run(App220222Application.class, args);
    }

    @Bean
   public Map<Integer, Employee> map()
   {
       return new HashMap<>();
   }

}
