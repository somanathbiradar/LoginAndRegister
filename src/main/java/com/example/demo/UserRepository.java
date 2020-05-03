package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.User1;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User1, Long> {
 
 User1 findByEmail(String email);

Object findByEmail(user user);

void save(user user);
}