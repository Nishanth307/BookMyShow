package com.bms.bms.dtos;

import lombok.Getter;

@Getter
public class CreateMovieRequest {
      private String name;
      private String genre;
      private Double rating;
}
