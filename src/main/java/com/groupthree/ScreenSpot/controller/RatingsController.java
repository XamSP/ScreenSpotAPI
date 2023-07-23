package com.groupthree.ScreenSpot.controller;

import com.groupthree.ScreenSpot.model.Ratings;
import com.groupthree.ScreenSpot.model.User;
import com.groupthree.ScreenSpot.repository.RatingsRepository;
import com.groupthree.ScreenSpot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingsController {

    @Autowired
    private RatingsRepository rateRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostMapping("/newRating")
    public Ratings createRating(@RequestBody Ratings rating){
        return this.rateRepository.save(rating);
    }
}
