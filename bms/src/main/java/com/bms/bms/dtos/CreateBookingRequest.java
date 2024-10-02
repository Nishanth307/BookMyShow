package com.bms.bms.dtos;

import java.util.List;
import java.util.ArrayList;

import lombok.Data;

@Data
public class CreateBookingRequest {
      private Long showId;
      private Long userId;
      private List<Long> showSeatId = new ArrayList<>();
}
