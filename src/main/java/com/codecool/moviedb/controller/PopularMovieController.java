package com.codecool.moviedb.controller;

import com.codecool.moviedb.components.HomepageMovieAPI;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/popular-movies")
@CrossOrigin("*")
public class PopularMovieController {

    @Autowired
    public HomepageMovieAPI homepageMovieAPI;

    @GetMapping
    public String getPopularMovies() throws IOException, JSONException {

        return homepageMovieAPI.getPopularMovies().toString();
    }

}
