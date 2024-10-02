package com.bms.bms.services;

import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.List;
import org.springframework.stereotype.Service;

import com.bms.bms.dtos.CreateShowRequest;
import com.bms.bms.models.Hall;
import com.bms.bms.models.Movie;
import com.bms.bms.models.Show;
import com.bms.bms.models.ShowSeat;
import com.bms.bms.repositories.ShowRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ShowService {
      private ShowRepository showRepository;

      private MovieService movieService;
      private HallService hallService;

      public Show createShow(CreateShowRequest request){
            //Get the movie id by calling movie service
            Movie movie = movieService.getMovie(request.getMovieid());
            //Get the hall seats using hallid
            Hall hall = hallService.getHall(request.getHallId());
            //create the showseats using the savedshow
            Show show = Show
            .builder()
            .hall(hall)
            //.startTime(request.getStartTime())
            .duartion(request.getDuartion())
            .movie(movie)
            .showSeats(Collections.emptyList())
            .build();
            //save the show again
            Show savedShow = showRepository.save(show);
            List<ShowSeat> seats = Collections.emptyList();

            return showRepository.save(savedShow.toBuilder().showSeats(seats).build());
      }

      public Show getShow(Long id){
            return showRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Show not found with id: " + id));
      }

}
