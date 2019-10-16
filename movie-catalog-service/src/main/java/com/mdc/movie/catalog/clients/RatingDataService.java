package com.mdc.movie.catalog.clients;

import com.mdc.movie.catalog.dto.RatingDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("RatingData")
public interface RatingDataService {
    @GetMapping(value = "http://localhost:8082/ratingdata/{movieId}", consumes = "application/json")
    RatingDto getRating(@PathVariable("movieId") String movieId);
}
