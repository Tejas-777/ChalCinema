package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.models.MovieModel;
import com.sunbeam.service.MovieServices;

@RestController
@RequestMapping("/theatre_admin")
public class MovieController {

    @Autowired
    private MovieServices movieService;

    @PostMapping("/movie")
    public String addMovie(@RequestBody MovieModel movieModel) {
        return movieService.addMovie(movieModel);
    }
}