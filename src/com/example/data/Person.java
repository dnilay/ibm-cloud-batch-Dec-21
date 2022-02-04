package com.example.data;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Person {

    private int personUniqueId;
    private String personName;
    private Address personAddress;
    private int age;

    private float assetValue;
}
