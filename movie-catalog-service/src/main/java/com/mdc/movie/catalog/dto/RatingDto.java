package com.mdc.movie.catalog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class RatingDto {
    private String movieId;
    private int rating;
}
