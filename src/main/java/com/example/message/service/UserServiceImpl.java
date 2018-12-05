package com.example.message.service;

import com.example.message.dao.UsersDao;
import com.example.message.model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    Logger LOGGER = LoggerFactory.getLogger (UserServiceImpl.class);

    @Autowired
    UsersDao userDao;

    @Override
    public Users authenticate(Users user) {
        user.setName ("PieChuckerr");
        user.setEmailAddress ("Govinda@cdac.in");
        LOGGER.info ("Authenticating => " + user.getUsername ());
        return user;
    }

    @Override
    public Users register(Users user) {
        LOGGER.debug ("Received request for registration => " + user.getEmailAddress ());
        return userDao.save (user);
    }
}
