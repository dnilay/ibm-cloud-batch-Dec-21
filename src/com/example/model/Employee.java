package com.example.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Employee {

    private String employeeId;
    private String employeeName;
    private double salary;
}
