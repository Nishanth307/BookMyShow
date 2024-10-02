package com.bms.bms.services;

import org.springframework.stereotype.Service;

import com.bms.bms.dtos.CreateMovieRequest;
import com.bms.bms.models.Movie;
import com.bms.bms.repositories.MovieRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MovieService {
      private MovieRepository movieRepository;
      public Movie getMovie(Long movieid) {
            return movieRepository.findById(movieid).orElse(null);
      }

      public Movie createMovie(CreateMovieRequest request){
            Movie movie = Movie.builder()
                               .genre(request.getGenre())
                               .name(request.getName())
                               .rating(request.getRating())
                               .build();
            return movieRepository.save(movie);
      }
      
}
