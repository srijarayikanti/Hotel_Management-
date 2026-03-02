package com.example.Hotel_mngmt.services;

import com.example.Hotel_mngmt.model.Request.RequestCustomer;
import com.example.Hotel_mngmt.model.Request.RequestCustomerId;
import com.example.Hotel_mngmt.model.Response.ResponseCustomer;
import com.example.Hotel_mngmt.model.Response.ResponseCustomerDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {

    ResponseEntity<List<ResponseCustomer>> saveCustomerList(
            List<RequestCustomer> requestCustomers);

    ResponseEntity<RequestCustomer> fetchCustomerDetails(RequestCustomerId request);

    ResponseEntity<?> fetchFamily(RequestCustomerId requestCustomer);
}
