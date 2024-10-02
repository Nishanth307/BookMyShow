package com.bms.bms.services;

import java.util.List;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.bms.bms.dtos.CreateBookingRequest;
import com.bms.bms.models.Booking;
import com.bms.bms.models.Show;
import com.bms.bms.models.ShowSeat;
import com.bms.bms.models.User;
import com.bms.bms.models.enums.BookedStatus;
import com.bms.bms.models.enums.SeatStatus;
import com.bms.bms.repositories.BookingRepository;

import java.util.NoSuchElementException;
import java.security.InvalidParameterException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookingService {
      private UserService userService;
      private ShowService showService;
      private ShowSeatService showSeatService;

      private BookingRepository bookingRepository;

      @Transactional(isolation = Isolation.SERIALIZABLE)
      public Booking createBooking( CreateBookingRequest request){
            //1)get user id and validate
            User user = userService.getUser(request.getUserId());
            if (user==null){
                  throw new NoSuchElementException("Invalid User Id from booking service "+request.getUserId());
            }
            //2)get show id and validate
            Show show = showService.getShow(request.getShowId());

            //2b)get show seats and check avalabilty and mark them as blocked
            List<ShowSeat> showSeats = showSeatService.getShowSeats(request.getShowSeatId());
            
            for (ShowSeat seat:showSeats){
                  if (seat.getSeatStatus()!=SeatStatus.AVAILABLE){
                        throw new InvalidParameterException("Seat is not available");
                  }
            }

            for (ShowSeat seat:showSeats){
                  seat.setSeatStatus(SeatStatus.PENDING);
            }
            List<ShowSeat> savedSeats = showSeatService.saveAll(showSeats);
            
            //3)calculate the price //ShowSeatRepository.saveAll(showSeats);
            Double amount = null;
            //4)create and save the booking
            Booking booking = Booking
                              .builder()
                              .user(user)
                              .show(show)
                              .seats(savedSeats)
                              .amount(amount)
                              .status(BookedStatus.PENDING)
                              .bookedAt(new Date())
                              .build();
            return bookingRepository.save(booking);
      }
}
