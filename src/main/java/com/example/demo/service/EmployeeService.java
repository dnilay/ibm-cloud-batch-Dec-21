package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.Collection;
import java.util.Set;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public Collection<Employee> getAllEmployees();
    public Employee findEmployeeById(Integer id);
    public void deleteEmployeeById(Integer id);
    public Employee updateEmployee(Employee employee,Integer id);
}
