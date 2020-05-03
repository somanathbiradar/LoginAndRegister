package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Role1;
import com.example.demo.User1;
import com.example.demo.Role1Respository;
import com.example.demo.UserRepository;
import java.util.Arrays;
import java.util.HashSet;

@Service("userService")
public class UserService {
 
 @Autowired
 private UserRepository userRepository;
 
 @Autowired
 private Role1Respository roleRespository;
 


 public Object signup(user user) {
  return userRepository.findByEmail(user);
 }

 public void login(user user) {
 
  userRepository.save(user);
 }

}