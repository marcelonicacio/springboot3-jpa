package com.marcenica.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcenica.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
