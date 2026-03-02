package com.example.Hotel_mngmt.controller;

import com.example.Hotel_mngmt.model.Request.RequestBookingDetails;
import com.example.Hotel_mngmt.services.BookingService;
import org.springframework.http.ResponseEntity;

public class BookingCustomerImpl implements BookingCustomer{
    private final BookingService bookingService;

    public BookingCustomerImpl(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @Override
    public ResponseEntity<RequestBookingDetails> saveFamilyBookingDetails(RequestBookingDetails request) {
        try {
            return bookingService.saveFamilyBookingDetails(request);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
