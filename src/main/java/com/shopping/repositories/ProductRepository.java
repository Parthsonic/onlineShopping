package com.shopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
