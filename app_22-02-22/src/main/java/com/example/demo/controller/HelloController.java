package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello()
    {

        return "Hello world REST";
    }
    @GetMapping("/employees")
    public Employee getEmployee()
    {
        return new Employee(UUID.randomUUID().toString(),"John Doe");
    }
}
