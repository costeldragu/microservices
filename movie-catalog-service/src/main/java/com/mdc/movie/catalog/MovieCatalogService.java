package com.mdc.movie.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MovieCatalogService {
    public static void main(String[] args) {
        SpringApplication.run(MovieCatalogService.class, args);
    }
}

