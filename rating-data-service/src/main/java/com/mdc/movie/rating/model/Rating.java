package com.mdc.movie.rating.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Rating {
    private String movieId;
    private int rating;
}
