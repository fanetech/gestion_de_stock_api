package com.fanetech.gestionDeStock.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@AllArgsConstructor
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {
    
    private String nom;
}
