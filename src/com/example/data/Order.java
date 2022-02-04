package com.example.data;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Order {

    private int orderId;
    private String orderName;
    private double orderValue;

}
