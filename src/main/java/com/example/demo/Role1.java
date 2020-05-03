package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role1 {
 
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(name="role_id")
 private int id;
 
 @Column(name="role")
 private String role;

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getRole() {
  return role;
 }

 public void setRole(String role) {
  this.role = role;
 }
}