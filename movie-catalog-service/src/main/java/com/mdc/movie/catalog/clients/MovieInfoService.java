package com.mdc.movie.catalog.clients;

import com.mdc.movie.catalog.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MovieInfo")
public interface MovieInfoService {

    @GetMapping(value = "http://localhost:8081/movies/{movieId}", consumes = "application/json")
    MovieDto getRating(@PathVariable("movieId") String movieId);
}
