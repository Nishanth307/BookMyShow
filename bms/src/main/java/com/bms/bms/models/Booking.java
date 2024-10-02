package com.bms.bms.models;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import com.bms.bms.models.enums.BookedStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table(name="city")for changing the table name
public class Booking extends BaseModel{
      private Double amount;
      //###
      @ManyToOne
      private Show show;

      @ManyToOne
      private User user;

      @ManyToMany
      private List<ShowSeat> seats = new ArrayList<>();

      private Date bookedAt;

      @Enumerated
      private BookedStatus status;


      @OneToMany
      private List<Payment> payments = new ArrayList<>();

}
