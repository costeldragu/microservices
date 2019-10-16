package com.mdc.movie.catalog.rest;

import com.mdc.movie.catalog.model.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        return Arrays.asList(
                CatalogItem.builder().name("Terminator").desc("All about of Terminator movie").rating(5).build(),
                CatalogItem.builder().name("Terminator 2").desc("All about of Terminator 2 movie").rating(2).build(),
                CatalogItem.builder().name("Avatar").desc("All about of Avatar movie").rating(4).build()
        );

    }
}
