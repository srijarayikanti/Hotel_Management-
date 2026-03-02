package com.example.Hotel_mngmt.model.Request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RequestBookingDetails {

    private int bookingId;
    private int customerId; //(foreign key)
    private int roomId; //(foreign key)
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String status; //(Booked, Checked-In, Checked-Out, Cancelled)
    private double totalAmount;
}
