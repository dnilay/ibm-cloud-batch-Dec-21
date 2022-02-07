package com.example;

import com.example.model.Employee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Set<Integer> set=new TreeSet<Integer>();
        set.add(10);
        set.add(88);
       // set.add(10);
        set.add(99);
        set.add(9);
        set.add(9);
        System.out.println(set);*/
        Set<Employee> employees=new HashSet<Employee>();
        employees.add(new Employee(1,"John","Doe","john@email.com"));
        employees.add(new Employee(2,"Marry","Public","marry@email.com"));
        employees.add(new Employee(3,"Sachin","Tendulkar","sachin@email.com"));
        employees.add(new Employee(4,"Rahul","Dravid","rahul@email.com"));
        employees.add(new Employee(5,"John","Pareera","john1@email.com"));
        System.out.println(employees);

        Iterator<Employee> iterator= employees.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //printing using enhanched for loop
        for(Employee s:employees)
        {
            System.out.println(s);
        }
    }
}
