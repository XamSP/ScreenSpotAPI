package com.groupthree.ScreenSpot.service;

import com.groupthree.ScreenSpot.model.User;
import com.groupthree.ScreenSpot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.groupthree.ScreenSpot.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

}
