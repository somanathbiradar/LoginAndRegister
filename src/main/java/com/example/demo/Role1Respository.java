package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Role1;

@Repository("roleRepository")
public interface Role1Respository extends JpaRepository<Role1, Integer> {

 Role1 findByRole(String role);
}