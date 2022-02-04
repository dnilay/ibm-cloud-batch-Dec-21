package com.example.service;

import com.example.exception.EmptyListException;
import com.example.exception.InvalidEmployeeException;
import com.example.model.Employee;
import com.example.repo.EmployeeRepository;
import com.example.repo.EmployeeRepositoryImpl;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class EmployeeServiceImpl implements EmployeeService{
    private static Scanner scanner=new Scanner(System.in);
    private EmployeeRepository employeeRepository;
    {
        employeeRepository=new EmployeeRepositoryImpl();
    }
    @Override
    public Employee createEmployee() {
        Employee employee=null;
        try {
            System.out.print("Enter Employee Name: ");
            String name= scanner.next();
            System.out.print("Enter Employee Salary: ");
            double salary=scanner.nextDouble();
            employee=new Employee(UUID.randomUUID().toString(),name,salary);
            employeeRepository.createEmployee(employee);
        }
        catch (InputMismatchException ime)
        {
            System.err.println("invalid input..");
        } catch (InvalidEmployeeException e) {
            System.err.println("Invalid Employee..");
        }


        return employee;
    }

    @Override
    public List<Employee> getEmployees() throws EmptyListException {

            return employeeRepository.displayEmployees();

    }
}
