package com.mdc.movie.rating.rest;

import com.mdc.movie.rating.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("ratingdata")
public class MovieRatingController {
    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return Rating.builder().movieId(movieId).rating(new Random().nextInt()).build();
    }
}
