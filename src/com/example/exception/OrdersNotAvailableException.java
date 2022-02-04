package com.example.exception;

public class OrdersNotAvailableException extends RuntimeException {

    private String message;

    public OrdersNotAvailableException(String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
