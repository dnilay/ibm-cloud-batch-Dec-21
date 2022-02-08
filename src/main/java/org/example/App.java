package org.example;

import org.example.factory.MyConnection;
import org.example.service.EmployeeService;
import org.example.service.EmployeeServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class App 
{
    private static EmployeeService employeeService;
    static
    {
        employeeService=new EmployeeServiceImpl();
    }
    public static void main( String[] args )
    {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));


        try {
            /*System.out.print("Enter First Name: ");
            String firstName=bufferedReader.readLine();
            System.out.print("Enter Last Name: ");
            String lastName=bufferedReader.readLine();
            System.out.print("Enter email: ");
            String email=bufferedReader.readLine();
            Employee employee=employeeService.createEmployee(new Employee(new Random().nextInt(1000),firstName,lastName,email));
            System.out.println(employee);*/
            System.out.print("Enter Id: ");
            int id=Integer.parseInt(bufferedReader.readLine());
            //Employee employee=employeeService.findEmployeeById(id);
                employeeService.deleteEmployee(id);
              //  System.out.println(employee);

        } catch (IOException | SQLException |NullPointerException e) {
            System.out.println(e.getMessage());
        }


    }
}
