package com.bms.bms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bms.bms.models.ShowSeat;
import com.bms.bms.repositories.ShowSeatRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ShowSeatService {
      private ShowSeatRepository showSeatRepository;
      public ShowSeat createShowSeat(ShowSeat showSeat){
            return showSeatRepository.save(showSeat);
      }
      public List<ShowSeat> getShowSeats(List<Long> showSeatIds) {
            return showSeatRepository.findAllById(showSeatIds);
      }

      public List<ShowSeat> saveAll(List<ShowSeat> showSeats) {
            return showSeatRepository.saveAll(showSeats);
      }
}
