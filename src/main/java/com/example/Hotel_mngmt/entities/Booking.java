package com.example.Hotel_mngmt.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table
public class Booking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BookingId")
    private int bookingId;

    @Column(name = "CustomerId")
    private int customerId; //(foreign key)

    @Column(name = "RoomId")
    private int roomId; //(foreign key)

    @Column(name = "CheckInDate")
    private LocalDate checkInDate;

    @Column(name = "CheckOutDate")
    private LocalDate checkOutDate;

    @Column(name = "Status")
    private String status; //(Booked, Checked-In, Checked-Out, Cancelled)

    @Column(name = "TotalAmount")
    private double totalAmount;
}
