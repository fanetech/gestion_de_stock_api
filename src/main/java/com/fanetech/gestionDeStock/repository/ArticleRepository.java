package com.fanetech.gestionDeStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fanetech.gestionDeStock.models.Article;

public interface ArticleRepository extends JpaRepository<Integer, Article> {

    Article findByAricleCode(String code);
    
}
