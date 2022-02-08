package org.example.service;

import org.example.Employee;
import org.example.repo.EmployeeRepository;
import org.example.repo.EmployeeRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl() {
        employeeRepository=new EmployeeRepositoryImpl();
    }

    @Override
    public Employee createEmployee(Employee employee) throws SQLException {
        return employeeRepository.createEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees() throws SQLException {
        return null;
    }

    @Override
    public Employee updateEmployee(Integer employeeId) throws SQLException {
        return null;
    }

    @Override
    public void deleteEmployee(Integer employeeId) throws SQLException {

    }

    @Override
    public Employee findEmployeeById(Integer employeeId) throws SQLException {
        return null;
    }
}
