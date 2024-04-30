package com.example.test.demo.service;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService{


    public User createUser(User user) ;

    public List<User> getAllUsers();
}
