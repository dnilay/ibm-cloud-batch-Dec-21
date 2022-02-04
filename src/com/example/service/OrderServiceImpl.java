package com.example.service;

import com.example.data.Order;
import com.example.exception.OrdersNotAvailableException;

import java.util.Scanner;

public class OrderServiceImpl implements OrderService{
    private Order[] orders=null;
    private static Scanner scanner=new Scanner(System.in);

    public OrderServiceImpl() {
        int size=0;
        System.out.print("Enter Number Of Orders--> ");
        size=scanner.nextInt();
        orders=new Order[size];

    }

    @Override
    public void createOrder(Order[] orders) {
        this.orders=orders;
    }

    @Override
    public Order[] displayAllOrders() throws OrdersNotAvailableException {
        orders[0]=new Order();
        if(orders[0].getOrderName()==null)
        {
            throw new OrdersNotAvailableException("No Orders, Order Database is Empty...");
        }

        return orders;
    }
}
