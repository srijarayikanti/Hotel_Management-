package com.example.Hotel_mngmt.services.Impl;

import com.example.Hotel_mngmt.Repositories.CustomerRepository;
import com.example.Hotel_mngmt.entities.Customer;
import com.example.Hotel_mngmt.model.Request.RequestCustomer;
import com.example.Hotel_mngmt.model.Request.RequestCustomerId;
import com.example.Hotel_mngmt.model.Response.ResponseCustomer;
import com.example.Hotel_mngmt.services.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public ResponseEntity<?> saveCustomer(RequestCustomer requestCustomer) {
        List<Customer> customer = new ArrayList<>();
        if (requestCustomer.getCustomerId() == 0) {
            BeanUtils.copyProperties(requestCustomer, customer);
        } else {
            Optional<Customer> customerOpt = customerRepository.findById(requestCustomer.getCustomerId());
            BeanUtils.copyProperties(requestCustomer, customer);
        }
        ResponseCustomer responseCustomer = new ResponseCustomer();
        responseCustomer.setCustomerId(requestCustomer.getCustomerId());
        responseCustomer.setName(requestCustomer.getName());
        return ResponseEntity.ok(responseCustomer);
    }

//    public ResponseEntity<RequestCustomer> fetchCustomerDetails(RequestCustomerId request) {
//
//    }
}

