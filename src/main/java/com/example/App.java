package com.example;

import com.example.model.Employee;
import com.example.model.NameComparator;
import com.example.model.SalaryComparator;

import java.util.*;

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
       /* Comparator nameComparator=new NameComparator();
        Set<Employee> employees=new TreeSet<>(nameComparator);
        employees.add(new Employee(new Random().nextInt(1000),"John","Doe","john@email.com",1000));
        employees.add(new Employee(new Random().nextInt(1000),"Marry","Public","marry@email.com",200));
        employees.add(new Employee(new Random().nextInt(1000),"Sachin","Tendulkar","sachin@email.com",3021));
        employees.add(new Employee(new Random().nextInt(1000),"Rahul","Dravid","rahul@email.com",1021));
        employees.add(new Employee(new Random().nextInt(1000),"John","Pareera","john1@email.com",200));
     //   System.out.println(employees);

        Iterator<Employee> iterator= employees.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //printing using enhanched for loop
      *//*  for(Employee s:employees)
        {
            System.out.println(s);
        }*/

        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set.contains(50));

    }
}
