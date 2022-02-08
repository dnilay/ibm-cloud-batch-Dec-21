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
        return employeeRepository.updateEmployee(employeeId);
    }

    @Override
    public void deleteEmployee(Integer employeeId) throws SQLException {
        employeeRepository.deleteEmployee(employeeId);

    }

    @Override
    public Employee findEmployeeById(Integer employeeId) throws SQLException {
        Employee employee=null;

            employee=employeeRepository.findEmployeeById(employeeId);
            if (employee==null)
            {
                throw new NullPointerException("no such element found");
            }
     return employee;
    }
}
