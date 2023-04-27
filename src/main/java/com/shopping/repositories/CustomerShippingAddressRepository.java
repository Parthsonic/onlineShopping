package com.shopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entities.CustomerShippingAddress;

public interface CustomerShippingAddressRepository extends JpaRepository<CustomerShippingAddress, Long> {

}
