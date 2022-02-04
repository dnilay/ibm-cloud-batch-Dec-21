package com.example.repo;

import com.example.exception.EmptyListException;
import com.example.exception.InvalidEmployeeException;
import com.example.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    public Employee createEmployee(Employee employee) throws InvalidEmployeeException;
    public List<Employee> displayEmployees() throws EmptyListException;
}
