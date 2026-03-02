package com.example.Hotel_mngmt.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ServiceId")
    private int ServiceId;
    @Column(name = "ServiceName")
    private String serviceName; //(e.g., Laundry, Spa, Room Service)
    @Column(name = "Price")
    private String price;
    @Column(name = "Availability")
    private String availability;
}
