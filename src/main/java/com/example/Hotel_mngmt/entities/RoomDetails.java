package com.example.Hotel_mngmt.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "room_details")
public class RoomDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RoomId")
    private int roomId;
    @Column(name = "RoomNumber")
    private int  roomNumber;
    @Column(name = "Type")
    private String type; //(Single, Double, Suite)
    @Column(name = "Status")
    private String status; //(Available, Booked, Maintenance)
    @Column(name = "pricePerDay")
    private String pricePerDay;
}
