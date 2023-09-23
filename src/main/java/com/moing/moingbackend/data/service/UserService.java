package com.moing.moingbackend.data.service;


import com.moing.moingbackend.data.dto.SignInResultDto;
import com.moing.moingbackend.data.dto.SignUpResultDto;
import com.moing.moingbackend.data.dto.UserDto;
import com.moing.moingbackend.data.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    UserDto getUserById(Long id);

    SignUpResultDto signUp(String account, String password,
                           String username, String email, String birthday,
                           String nickname, String phoneNumber,String role);
    SignInResultDto signIn(String account, String password);
    void withdraw(Long id);
    PasswordEncoder passwordEncoder();
}