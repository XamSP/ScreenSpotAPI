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
//    @Override
//    public User saveUser(User user) {
//        return userRepository.saveAll(user);
//    }
//
//    public User getUserById(Long userId);
//
//    public void deleteUserById(Long userId);
//
//    public User updateDepartment(Long userId, User user);
//
//    public User getUserByName(String userName);
}
