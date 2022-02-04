package com.example.app;

import com.example.exception.OrdersNotAvailableException;
import com.example.service.OrderService;
import com.example.service.OrderServiceImpl;

public class MyApp {


    public static void main(String[] args) {
        OrderService service=new OrderServiceImpl();

        try {
            System.out.println(service.displayAllOrders());
        }
        catch (OrdersNotAvailableException e)
        {
            System.err.println(e.getMessage());
        }

    }
}
