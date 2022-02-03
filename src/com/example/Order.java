package com.example;

import java.util.UUID;

public class Order {

    private String orderId;
    private String orderName;
    private static  String vendorName;

    {
        orderId= UUID.randomUUID().toString();
        orderName="Order-1";

    }

    static
    {
        vendorName="Vendor-1";
        System.out.println("Within Static block: "+vendorName );
    }

    @Override
    public String toString() {
        return
                "orderId=" + orderId +
                " orderName= " + orderName +"vendor name: "+ vendorName;
    }

    public static void main(String args[])
    {
        System.out.println("Within Main");
        Order order=new Order();
        System.out.println(order);
    }

}
