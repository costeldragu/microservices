package com.mdc.movie.catalog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MovieDto {
    private String movieId;
    private String name;
}
