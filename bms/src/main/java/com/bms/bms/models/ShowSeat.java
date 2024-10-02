package com.bms.bms.models;

import com.bms.bms.models.enums.SeatStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
      

      @ManyToOne
      private Seat seat;

      @ManyToOne
      private Show show;

      @Enumerated
      private SeatStatus seatStatus;
}
