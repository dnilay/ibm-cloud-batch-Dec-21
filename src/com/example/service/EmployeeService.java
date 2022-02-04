package com.example.service;

import com.example.exception.EmptyListException;
import com.example.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee createEmployee();

    public List<Employee> getEmployees() throws EmptyListException;

}
