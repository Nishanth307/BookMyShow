package com.bms.bms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bms.dtos.CreateMovieRequest;
import com.bms.bms.models.Movie;
import com.bms.bms.services.MovieService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@AllArgsConstructor
public class MovieController {
      private MovieService movieService;
      @GetMapping("/movie")
      public Movie getMovies(String param) {
          return null;
      }
      
      @GetMapping("/movie/{id}")
      public Movie getMovie(@PathVariable Long id){
            return movieService.getMovie(id);
      }

      @PostMapping("/movie")
      public Movie createMovie(@RequestBody CreateMovieRequest request){
            return movieService.createMovie(request);
      }
}
