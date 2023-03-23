package com.fanetech.gestionDeStock.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity {

    @Column(name = "nom")
    private String nom;
    
}
