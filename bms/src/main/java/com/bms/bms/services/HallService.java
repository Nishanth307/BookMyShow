package com.bms.bms.services;

import org.springframework.stereotype.Service;

import com.bms.bms.models.Hall;
import com.bms.bms.repositories.HallRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HallService {
      private HallRepository hallRepository;
      public Hall createHall(){
            return null;
      }
      public Hall getHall(Long hallId) {
            return hallRepository.findById(hallId).orElse(null);
      }
}
