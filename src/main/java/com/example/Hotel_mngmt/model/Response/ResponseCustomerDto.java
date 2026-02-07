package com.example.Hotel_mngmt.model.Response;

import lombok.Data;

@Data
public class ResponseCustomerDto {
    private int customer_id;
    private int customerFamilyId;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String id_proof;
}
