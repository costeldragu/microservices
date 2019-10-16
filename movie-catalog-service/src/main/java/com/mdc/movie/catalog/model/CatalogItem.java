package com.mdc.movie.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CatalogItem {
 private String name;
 private String desc;
 private int rating;
}
