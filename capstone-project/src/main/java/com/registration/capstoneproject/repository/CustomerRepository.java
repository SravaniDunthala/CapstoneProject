package com.registration.capstoneproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.capstoneproject.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}

