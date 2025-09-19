package com.example.Hotel_mngmt.services.Impl;

import com.example.Hotel_mngmt.Repositories.CustomerRepository;
import com.example.Hotel_mngmt.entities.Customer;
import com.example.Hotel_mngmt.model.Request.RequestCustomer;
import com.example.Hotel_mngmt.model.Request.RequestCustomerId;
import com.example.Hotel_mngmt.model.Response.ResponseCustomer;
import com.example.Hotel_mngmt.services.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
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
        Customer customer;
        if (requestCustomer.getCustomer_id() == 0) {
            customer = new Customer();
        } else {
            customer = customerRepository.findById(requestCustomer.getCustomer_id())
                    .orElse(new Customer());
        }
        BeanUtils.copyProperties(requestCustomer, customer, "customer_id");
        Customer savedCustomer = customerRepository.save(customer);
        ResponseCustomer responseCustomer = new ResponseCustomer();
        responseCustomer.setCustomerId(savedCustomer.getCustomer_id());
        responseCustomer.setName(savedCustomer.getName());
        return ResponseEntity.ok(responseCustomer);
    }

    @Override
    public ResponseEntity<RequestCustomer> fetchCustomerDetails(RequestCustomerId request) {
        Optional<Customer> customer=customerRepository.findById(request.getCustomer_id());
                //.orElseThrow(new RuntimeException("find"));
        if(customer.isEmpty()){
            throw new RuntimeException("find");
        }
        RequestCustomer customer1=new RequestCustomer();
        BeanUtils.copyProperties(customer.get(),customer1);
        return new ResponseEntity<>(customer1, HttpStatus.OK);
    }
}

