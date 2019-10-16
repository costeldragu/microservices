package com.mdc.movie.catalog.clients;

import com.mdc.movie.catalog.dto.RatingDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "RatingData", url = "http://localhost:8082")
public interface RatingDataService {
    @GetMapping(value = "/ratingdata/{movieId}", consumes = "application/json")
    RatingDto getRating(@PathVariable("movieId") String movieId);
}
