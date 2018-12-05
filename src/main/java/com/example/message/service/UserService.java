package com.example.message.service;

import com.example.message.model.Users;

public interface UserService {

    Users authenticate(Users user);
    Users register(Users user);
}
