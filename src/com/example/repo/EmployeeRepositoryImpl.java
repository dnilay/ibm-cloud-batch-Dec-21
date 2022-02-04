package com.example.repo;

import com.example.exception.EmptyListException;
import com.example.exception.InvalidEmployeeException;
import com.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{

    private List<Employee> employees;

    {
        employees=new ArrayList<Employee>();
    }
    @Override
    public Employee createEmployee(Employee employee) throws InvalidEmployeeException {
        if ((employee.getEmployeeName().length()<5) ||(employee.getSalary()<10000))
        {
            throw new InvalidEmployeeException("invalid employee");
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> displayEmployees() throws EmptyListException {
        if (employees.isEmpty())
        {
            throw new EmptyListException("employee database is empty");
        }
        return employees;
    }
}
