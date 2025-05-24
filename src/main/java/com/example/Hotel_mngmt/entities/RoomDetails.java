package com.example.Hotel_mngmt.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class RoomDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "RoomNumber")
    private int  roomNumber;
    @Column(name = "Type")
    private String type; //(Single, Double, Suite)
    @Column(name = "Status")
    private String status; //(Available, Booked, Maintenance)
    @Column(name = "pricePerDay")
    private String pricePerDay;
}
