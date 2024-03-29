package com.mdc.movie.catalog.clients;

import com.mdc.movie.catalog.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "MovieInfo" , url = "http://localhost:8081")
public interface MovieInfoService {

    @GetMapping(value = "/movies/{movieId}", consumes = "application/json")
    MovieDto getMovie(@PathVariable("movieId") String movieId);
}
