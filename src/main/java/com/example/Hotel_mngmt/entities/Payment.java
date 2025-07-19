package com.example.Hotel_mngmt.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
@Data
@Entity
@Table
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PaymentId")
    private int paymentId;

    @Column(name = "BookingId")
    private int bookingId; //(foreign key)

    @Column(name = "Amount")
    private double amount;

    @Column(name = "PaymentDate")
    private LocalDate paymentDate;

    @Column(name = "PaymentMethod")
    private String paymentMethod; //(Cash, Card, UPI, etc.)
}
