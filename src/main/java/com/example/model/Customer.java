package com.example.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {

    private String customerName;
    private String customerAddress;
    private CustomerType customerType;
}
