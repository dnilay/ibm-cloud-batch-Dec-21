package com.example.employeeservice.controller;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repo.EmployeeRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@RestController

public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Operation(summary = "employee api create new employee")
    @ApiResponse(responseCode = "201",description = "created sucesfully")
    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
    {
        employee.setEmployeeId(UUID.randomUUID());
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeRepository.save(employee));
    }
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> fetchAllEmployees()
    {
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    @GetMapping("/employees/{employeeId}")
    public ResponseEntity<Optional<Employee>> findEmploy(@PathVariable("employeeId")UUID employeeId)
    {
        return ResponseEntity.ok(employeeRepository.findById(employeeId));
    }
}
