package com.example.Hotel_mngmt.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_id")
    private int customer_id;
    @Column(name = "CustomerFamilyId")
    private int customerFamilyId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "Address")
    private String address;
    @Column(name = "Id_proof")
    private String id_proof;
}
