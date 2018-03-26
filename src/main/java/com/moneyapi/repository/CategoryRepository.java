package com.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moneyapi.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
