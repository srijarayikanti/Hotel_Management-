package com.example.Hotel_mngmt.services;

import com.example.Hotel_mngmt.model.Request.RequestBookingDetails;
import org.springframework.http.ResponseEntity;

public interface BookingService {
    ResponseEntity<RequestBookingDetails> saveFamilyBookingDetails(RequestBookingDetails request);
}
