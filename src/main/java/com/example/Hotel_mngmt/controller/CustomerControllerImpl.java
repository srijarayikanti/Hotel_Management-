package com.example.Hotel_mngmt.controller;

import com.example.Hotel_mngmt.model.Request.RequestCustomer;
import com.example.Hotel_mngmt.model.Request.RequestCustomerId;
import com.example.Hotel_mngmt.model.Response.ResponseCustomer;
import com.example.Hotel_mngmt.model.Response.ResponseCustomerDto;
import com.example.Hotel_mngmt.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Slf4j
public class CustomerControllerImpl implements CustomerController {

    private final CustomerService customerService;

    public CustomerControllerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public ResponseEntity<List<ResponseCustomer>> saveCustomerList(List<RequestCustomer> requestCustomer) {
        log.debug("CustomerControllerImpl: saveCustomer");
        try {
            return customerService.saveCustomerList(requestCustomer);
        } catch (Exception e) {
            log.debug("CustomerControllerImpl: ErrorException");
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResponseEntity<?> fetchCustomerDetails(RequestCustomerId request) {
        try {
            ResponseEntity<?> response = customerService.fetchCustomerDetails(request);
            return response;
        } catch (Exception e) {
            log.debug("CustomerControllerImpl: ErrorException");
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResponseEntity<?> fetchFamily(RequestCustomerId requestCustomer) {
        try {
            return customerService.fetchFamily(requestCustomer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
