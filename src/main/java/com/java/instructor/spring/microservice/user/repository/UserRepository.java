package com.java.instructor.spring.microservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.instructor.spring.microservice.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}