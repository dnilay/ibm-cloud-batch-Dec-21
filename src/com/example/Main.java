package com.example;

import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner( System.in);
	// write your code here
        //primitive type
        int a=100;
        //boxing
        //Integer x=new Integer(a);
        //auto-boxing
        Integer x=10;
        //unboxing
        //int result=x.intValue();
        //auto-unboxing
        int result=x;

        Beer myBeer=new Beer();
        String[] str=UUID.randomUUID().toString().split("-");
        myBeer.setBeerId(str[4]);
        System.out.println("Enter Beer Name: ");
        String name=scanner.next();
        myBeer.setBeerName(name);
        System.out.println("Enter Per Unit Cost: ");
        double costPerUnit=scanner.nextDouble();
        myBeer.setCostPerUnit(costPerUnit);
        System.out.println("Enter Stock: ");
        int stock=scanner.nextInt();
        myBeer.setUnitInStock(stock);
        System.out.println(myBeer);

    }
}
