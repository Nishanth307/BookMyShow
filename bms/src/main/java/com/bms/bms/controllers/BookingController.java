package com.bms.bms.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.bms.bms.dtos.CreateBookingRequest;
import com.bms.bms.models.Booking;
import com.bms.bms.services.BookingService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@AllArgsConstructor
public class BookingController {
      //create a booking
      private BookingService bookingService;

      @PostMapping("/booking")
      public Booking createBooking(@RequestBody CreateBookingRequest request){
            return bookingService.createBooking(request);
      }
}
