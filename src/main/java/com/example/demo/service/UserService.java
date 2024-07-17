package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    UserDto getOne(Long id);
    List<UserDto> getAll();
    UserDto createUser(User user);
    UserDto  updateUser(Long id , User user);
    String deleteUser(Long id);
}
