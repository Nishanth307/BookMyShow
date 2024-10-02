package com.bms.bms.models;
import com.bms.bms.models.enums.SeatType;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Table(name="city")for changing the table name
public class Seat extends BaseModel{
      private Integer seatNo;

      @Enumerated
      private SeatType seatType;
}

