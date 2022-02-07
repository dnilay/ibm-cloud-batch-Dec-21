package com.example.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;

    /*@Override
    public int compareTo(Object o) {
        Employee employee=(Employee)o;
        if (this.getEmployeeId()>employee.getEmployeeId())
        {
            return -1;
        }
        else if (this.getEmployeeId()<employee.getEmployeeId())
        {
            return 1;
        }
        {
            return 0;
        }

    }*/
}