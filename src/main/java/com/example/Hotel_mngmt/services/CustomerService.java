package com.example.Hotel_mngmt.services;

import com.example.Hotel_mngmt.model.Request.RequestCustomer;
import com.example.Hotel_mngmt.model.Request.RequestCustomerId;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
    ResponseEntity<?> saveCustomer(RequestCustomer requestCustomer);

    ResponseEntity<RequestCustomer> fetchCustomerDetails(RequestCustomerId request);
}
