package com.example.Hotel_mngmt.services.Impl;

import com.example.Hotel_mngmt.Repositories.BookingRepository;
import com.example.Hotel_mngmt.entities.Booking;
import com.example.Hotel_mngmt.model.Request.RequestBookingDetails;
import com.example.Hotel_mngmt.services.BookingService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public ResponseEntity<RequestBookingDetails> saveFamilyBookingDetails(RequestBookingDetails request){
        Booking booking=new Booking();
        if(request.getBookingId()==0){
            BeanUtils.copyProperties(request,booking);
            bookingRepository.save(booking);
        }
        else{
            Optional<Booking> updateBooking=bookingRepository.findById(request.getBookingId());
            BeanUtils.copyProperties(request,booking,"bookingId");
            bookingRepository.save(booking);
        }

        return new ResponseEntity<>(request, HttpStatus.OK);
    }
}
