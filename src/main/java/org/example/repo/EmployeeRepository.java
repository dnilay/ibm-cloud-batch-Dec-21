package org.example.repo;

import org.example.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeRepository {
    public Employee createEmployee(Employee employee)throws SQLException;
    public List<Employee> getEmployees() throws SQLException;
}
