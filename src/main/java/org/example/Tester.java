package org.example;

import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Random;

public class Tester {

    private static EmployeeService employeeService;
    private  static EmployeeService getEmployeeService()
    {
        try {
            ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext2.xml");
            employeeService=applicationContext.getBean("employeeService",EmployeeService.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return employeeService;
    }

    public static void main(String[] args) {
        try {
            Process process;
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter First Name:  ");
            String fName = bufferedReader.readLine();
            System.out.print("Enter Last Name: ");
            String lName=bufferedReader.readLine();
            System.out.print("Enter Email: ");
            String email=bufferedReader.readLine();
            Employee employee=getEmployeeService().createEmployee(new Employee(new Random().nextInt(1000),fName,lName,email));
            System.out.println("Employee Created: "+employee);
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }

    }
}
