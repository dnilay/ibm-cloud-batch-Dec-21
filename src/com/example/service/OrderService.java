package com.example.service;

import com.example.data.Order;
import com.example.exception.OrdersNotAvailableException;

public interface OrderService {
    public void createOrder(Order[] orders);
    public Order[] displayAllOrders() throws OrdersNotAvailableException;


}
