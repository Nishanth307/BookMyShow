package com.bms.bms.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;;

@AllArgsConstructor
@Data
public class CreateShowRequest {
      private Long hallId;
      private Long movieid;
      private Integer duartion;
}
