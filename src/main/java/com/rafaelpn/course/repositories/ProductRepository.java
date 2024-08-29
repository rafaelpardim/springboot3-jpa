package com.rafaelpn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelpn.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
