package com.java.instructor.spring.microservice.user.service;

import com.java.instructor.spring.microservice.user.dto.ResponseDto;
import com.java.instructor.spring.microservice.user.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}