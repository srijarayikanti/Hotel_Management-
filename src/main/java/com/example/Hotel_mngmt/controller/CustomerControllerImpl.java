package com.example.Hotel_mngmt.controller;

import com.example.Hotel_mngmt.model.Request.RequestCustomer;
import com.example.Hotel_mngmt.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class CustomerControllerImpl implements CustomerController{

    private final CustomerService customerService;

    public CustomerControllerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public ResponseEntity<?> saveCustomer(RequestCustomer requestCustomer){
        log.debug("CustomerControllerImpl: saveCustomer");
        try {
            ResponseEntity<?> response=customerService.saveCustomer(requestCustomer);
            return response;
        } catch (Exception e) {
            log.debug("CustomerControllerImpl: ErrorException");
            throw new RuntimeException(e);
        }
    }
}
