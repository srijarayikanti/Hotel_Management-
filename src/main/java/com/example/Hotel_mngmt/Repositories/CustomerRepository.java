package com.example.Hotel_mngmt.Repositories;

import com.example.Hotel_mngmt.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>
{
    @Query("SELECT c FROM Customer c WHERE c.customerFamilyId = :customerFamilyId")
    List<Customer> findByCustomerFamilyId(@Param("customerFamilyId") int customerFamilyId);

}
