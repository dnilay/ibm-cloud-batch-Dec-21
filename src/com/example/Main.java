package com.example;

import com.example.data.Address;
import com.example.data.Person;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        System.out.print("Enter Person Name: ");
        String name= scanner.next();
        System.out.print("Enter Address Line1: ");
        String address1=scanner.next();
        System.out.print("Enter Address Line2: ");
        String address2=scanner.next();
        int zipcode=0;
        int contact=0;
        int age=0;
        try {
            System.out.print("Enter Zipcode: ");
            zipcode = scanner.nextInt();
            System.out.print("Enter Contact Number: ");
            contact=scanner.nextInt();
            System.out.print("Enter Age: ");
            age=scanner.nextInt();
        }

       /* catch (InputMismatchException inputMismatchException)
        {
            System.err.println("invalid input."+inputMismatchException.toString());

        }*/
        catch (RuntimeException e)
        {
            System.err.println("invalid input."+e.toString());
        }



        Person person=new Person(new Random().nextInt(1000),name,new Address(address1,address2,zipcode,contact),age);

        System.out.println(person);

    }
}
