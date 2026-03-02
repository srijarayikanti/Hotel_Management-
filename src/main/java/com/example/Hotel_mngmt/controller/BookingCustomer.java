package com.example.Hotel_mngmt.controller;

import com.example.Hotel_mngmt.entities.Booking;
import com.example.Hotel_mngmt.entities.User;
import com.example.Hotel_mngmt.model.Request.RequestBookingDetails;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface BookingCustomer {
    @Operation(
            summary="saveFamilyBookingDetails",
            operationId="saveFamilyBookingDetails",
            tags="Booking",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Booking.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Booking.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/Booking/saveFamilyBookingDetails",
            produces = "application/json",
            consumes = "application/json"
    )
    @CrossOrigin
    ResponseEntity<RequestBookingDetails> saveFamilyBookingDetails(
            @RequestBody RequestBookingDetails request);
}
