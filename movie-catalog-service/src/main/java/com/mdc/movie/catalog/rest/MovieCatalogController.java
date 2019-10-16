package com.mdc.movie.catalog.rest;

import com.mdc.movie.catalog.clients.MovieInfoService;
import com.mdc.movie.catalog.clients.RatingDataService;
import com.mdc.movie.catalog.dto.MovieDto;
import com.mdc.movie.catalog.dto.RatingDto;
import com.mdc.movie.catalog.model.CatalogItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
    private final MovieInfoService movieInfoService;
    private final RatingDataService ratingDataService;

    @Autowired
    public MovieCatalogController(MovieInfoService movieInfoService, RatingDataService ratingDataService) {
        this.movieInfoService = movieInfoService;
        this.ratingDataService = ratingDataService;
    }

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        MovieDto movieDto = movieInfoService.getMovie("Terminator");
        RatingDto ratingDto = ratingDataService.getRating("Terminator");

        return Arrays.asList(
                CatalogItem.builder().name(movieDto.getName()).desc("All about of Terminator movie").rating(ratingDto.getRating()).build()

        );

    }
}
