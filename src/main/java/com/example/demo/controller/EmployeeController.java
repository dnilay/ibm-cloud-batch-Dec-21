package com.example.demo.controller;

import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.exception.ErrorResponse;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;



    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleError(EmployeeNotFoundException e)
    {
        ErrorResponse errorResponse=new ErrorResponse();
        errorResponse.setErrorMessage(e.getMessage());
        errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
        errorResponse.setErrorReportingTime(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    @GetMapping("/")
    public String sayHello()
    {

        return "Hello world REST";
    }
    @GetMapping("/employees")
    public Collection<Employee> getEmployee()
    {

        return employeeService.getAllEmployees();
    }
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeService.createEmployee(employee);
    }
    @GetMapping("/employees/{id}")
    public Employee findEmployee(@PathVariable("id") Integer id)
    {
        Employee employee=employeeService.findEmployeeById(id);
        if (employee==null)
        {
            throw new EmployeeNotFoundException("employee with given id "+id+ " is not found");
        }
        return employee;
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id)
    {
        employeeService.deleteEmployeeById(id);
        return "deletion successful";
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("id") Integer id)
    {
        return employeeService.updateEmployee(employee,id);
    }
}
