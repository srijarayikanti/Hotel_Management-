package com.example.Hotel_mngmt.Repositories;

import com.example.Hotel_mngmt.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>
{
}
