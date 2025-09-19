package com.example.Hotel_mngmt.model.Request;

import lombok.Data;

import java.io.Serializable;

@Data
public class RequestCustomer implements Serializable {
    private int customer_id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String id_proof;
}
