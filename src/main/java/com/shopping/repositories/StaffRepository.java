package com.shopping.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entities.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {
	Optional<Staff> findByUsername(String username);
}
