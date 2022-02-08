package org.example.service;

import org.example.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee) throws SQLException;
    public List<Employee> getAllEmployees() throws SQLException;
    public Employee updateEmployee(Integer employeeId) throws SQLException;
    public void deleteEmployee(Integer employeeId)throws SQLException;
    public Employee findEmployeeById(Integer employeeId) throws SQLException;
}
