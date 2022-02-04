package com.example;

import com.example.exception.EmptyListException;
import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static EmployeeService employeeService;

    static {
        employeeService = new EmployeeServiceImpl();
    }

    public static void main(String[] args) {

        int choice = 0;
        do {
            System.out.println("1. Create employee. ");
            System.out.println("2. Display All Employees. ");
            System.out.println("0. Exit. ");
            System.out.print("Enter Your choice. ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.println("employee created: " + employeeService.createEmployee());
                    } catch (Exception e) {
                        System.out.println("error occurred..");
                    }

                    break;
                case 2:
                    try {
                        List<Employee> list = employeeService.getEmployees();
                        System.out.println(list);
                    } catch (EmptyListException e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    System.out.println("Bye..!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice.");
                    break;
            }

        } while (choice != 0);
    }
}
