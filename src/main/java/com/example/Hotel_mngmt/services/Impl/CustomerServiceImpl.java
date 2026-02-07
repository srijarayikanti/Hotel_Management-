package com.example.Hotel_mngmt.services.Impl;

import com.example.Hotel_mngmt.Repositories.CustomerRepository;
import com.example.Hotel_mngmt.entities.Customer;
import com.example.Hotel_mngmt.model.Request.RequestCustomer;
import com.example.Hotel_mngmt.model.Request.RequestCustomerId;
import com.example.Hotel_mngmt.model.Response.ResponseCustomer;
import com.example.Hotel_mngmt.model.Response.ResponseCustomerDto;
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
    public ResponseEntity<List<ResponseCustomer>> saveCustomerList(
            List<RequestCustomer> requestCustomers) {

        List<Customer> customersToSave = new ArrayList<>();

        for (RequestCustomer request : requestCustomers) {

            Customer customer;

            // Create or Update
            if (request.getCustomer_id() == 0) {
                customer = new Customer();
            } else {
                customer = customerRepository.findById(request.getCustomer_id())
                        .orElse(new Customer());
            }

            BeanUtils.copyProperties(request, customer, "customer_id");
            customersToSave.add(customer);
        }

        // Save all customers
        List<Customer> savedCustomers = customerRepository.saveAll(customersToSave);

        // Prepare response
        List<ResponseCustomer> responseList = new ArrayList<>();
        for (Customer saved : savedCustomers) {
            ResponseCustomer response = new ResponseCustomer();
            response.setCustomerId(saved.getCustomer_id());
            response.setName(saved.getName());
            responseList.add(response);
        }

        return ResponseEntity.ok(responseList);
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

    @Override
    public ResponseEntity<?> fetchFamily(RequestCustomerId requestCustomer){
        List<Customer> customer=customerRepository.findByCustomerFamilyId(requestCustomer.getCustomerFamilyId());
        if(customer.isEmpty()){
            return new ResponseEntity<>("There are not family details for the given ID",
                    HttpStatus.NOT_FOUND);
        }
        List<ResponseCustomerDto> responseCustomerDtoList=new ArrayList<>();
        for(Customer customer1:customer){
            ResponseCustomerDto responseCustomerDto1=new ResponseCustomerDto();
            BeanUtils.copyProperties(customer,responseCustomerDto1);
            responseCustomerDtoList.add(responseCustomerDto1);
        }
        return new ResponseEntity<>(responseCustomerDtoList,HttpStatus.OK);
    }
}

