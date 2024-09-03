package com.rafaelpn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelpn.course.entities.OrderItem;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {

}
