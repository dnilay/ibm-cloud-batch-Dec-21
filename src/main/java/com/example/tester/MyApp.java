package com.example.tester;

import com.example.model.Customer;
import com.example.model.CustomerType;

import java.io.*;
import java.util.*;

public class MyApp {
    private static Map<Integer, Customer> customerMap=null;
    static
    {
        customerMap=new HashMap<>();
    }
    public static void main(String[] args) {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        int choice=0;
        String name=null;
        String address = null;
        CustomerType customerType=null;
        do{
            System.out.println("1. Create A Customer. ");
            System.out.println("2. Display All Customer.");
            System.out.println("0.Exit. ");
            System.out.print("Enter Your Choice: ");
            try {
                choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice)
                {
                    case 1:
                        System.out.print("Enter Customer Name: ");
                        name= bufferedReader.readLine();
                        System.out.print("Enter Customer Address: ");
                        address=bufferedReader.readLine();
                        System.out.print("Enter Customer Type: ");
                        customerType=CustomerType.valueOf(bufferedReader.readLine());
                        Customer customer=new Customer(name,address,customerType);
                        customerMap.put(new Random().nextInt(1000),customer);
                        System.out.println("customer added successfully");
                        break;
                    case 2:
                        Collection<Customer> collection=customerMap.values();
                        Iterator<Customer> customerIterator= collection.iterator();
                        while (customerIterator.hasNext())
                        {
                            System.out.println(customerIterator.next());
                        }
                        Set set=customerMap.entrySet();
                        Iterator iterator= set.iterator();
                        while (iterator.hasNext())
                        {
                            System.out.println(iterator.next());
                        }
                        break;
                    case 0:
                        System.out.println("Bye.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid choice: ");
                        break;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }while (choice!=0);



    }
}
