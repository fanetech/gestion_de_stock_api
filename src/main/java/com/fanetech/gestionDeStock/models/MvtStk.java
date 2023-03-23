package com.fanetech.gestionDeStock.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table(name = "mvtStk")
public class MvtStk extends AbstractEntity {
    
    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;
    
}
