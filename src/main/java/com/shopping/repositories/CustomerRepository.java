package com.shopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
