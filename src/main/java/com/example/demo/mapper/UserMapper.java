package com.example.demo.mapper;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface UserMapper {
    UserDto getUserById(Long id);
    List<UserDto> getAllUsers();
    UserDto addUser(User user);
    UserDto updateUser(Long id , User user);
    UserDto deleteUser(Long id);
}

