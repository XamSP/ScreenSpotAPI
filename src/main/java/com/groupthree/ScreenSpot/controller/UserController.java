package com.groupthree.ScreenSpot.controller;

import com.groupthree.ScreenSpot.model.User;
import com.groupthree.ScreenSpot.repository.UserRepository;
import com.groupthree.ScreenSpot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    private UserService userService;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostMapping("/newcustomer")
    public User createUser(@RequestBody User user){
        //return this.userRepository.save(user);
        return null;
    }

    @GetMapping("/allcustomers")
    public List<User> getAllUsers(){
        return this.userRepository.findAllUsers();
    }

    @GetMapping(value = "/customers/{id}")
    public List<User> getCustomerByEmail(@PathVariable long id) { //might need to change long to Long
        return userRepository.findById(id);
    }

}
