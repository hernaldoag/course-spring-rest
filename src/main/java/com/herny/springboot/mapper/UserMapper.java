package com.herny.springboot.mapper;

import com.herny.springboot.dto.UserDto;
import com.herny.springboot.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        //Convert User JPA Entity into UserDto
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;

    }

    public static User mapToUser(UserDto userDto) {
        //Convert UserDto  into User JPA entity
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return  user;
    }

}
