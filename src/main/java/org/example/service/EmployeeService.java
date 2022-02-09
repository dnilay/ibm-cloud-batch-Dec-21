package org.example.service;

import org.example.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee)throws SQLException;
    public List<Employee> getEmployees() throws SQLException;
}
