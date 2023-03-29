package com.fanetech.gestionDeStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fanetech.gestionDeStock.models.Category;

public interface CategoryRepository extends JpaRepository<Integer, Category> {
    
}
