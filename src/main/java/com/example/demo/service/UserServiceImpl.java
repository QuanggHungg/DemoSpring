package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.exception.GlobalExceptionHandling;
import com.example.demo.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    final UserMapper userMapper;
    @Override
    public UserDto getOne(Long id) {
        UserDto user = userMapper.getUserById(id);
        if (user == null) {
            throw new GlobalExceptionHandling.NotFoundResource("User not found");
        }
        return user;
    }

    @Override
    public List<UserDto> getAll() {
        List<UserDto> userDtos = userMapper.getAllUsers();
        return userDtos;
    }

    @Override
    public UserDto createUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public UserDto updateUser(Long id, User user) {
        return userMapper.updateUser(id, user);
    }

    @Override
    public String deleteUser(Long id) {
        userMapper.deleteUser(id);
        return "User has been deleted";
    }

}
