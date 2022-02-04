package com.example.data;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Address {

    private String addressLine1;
    private String addressLine2;
    private int zipCode;
    private int contactNumber;

}
