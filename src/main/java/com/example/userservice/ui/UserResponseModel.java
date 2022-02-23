package com.example.userservice.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserResponseModel {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
}
