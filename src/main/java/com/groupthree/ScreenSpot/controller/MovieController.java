package com.groupthree.ScreenSpot.controller;

import com.groupthree.ScreenSpot.model.Movie;
import com.groupthree.ScreenSpot.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/movies/")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/allMovies")
    public List<Movie> getAllMovies() {
        return this.movieRepository.findAllMovies();
    }
}
