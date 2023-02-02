package com.herny.springboot.service;

import com.herny.springboot.dto.UserDto;
import com.herny.springboot.entity.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);
    UserDto getUserByID(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
