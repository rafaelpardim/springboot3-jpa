package com.rafaelpn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelpn.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
