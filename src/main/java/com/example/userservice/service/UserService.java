package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.ui.UserRequestModel;
import com.example.userservice.ui.UserResponseModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public UserDto createUser(UserDto userDto);
    public List<UserDto> getUsers();
    public UserDto findUserByUserId(String userId);
    public void deleteUserByUserId(String userId);

    public UserResponseModel updateUserByEmail(UserRequestModel userRequestModel, String email);

}
