package org.example;

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
}
