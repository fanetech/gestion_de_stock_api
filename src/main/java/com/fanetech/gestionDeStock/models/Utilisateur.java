package com.fanetech.gestionDeStock.models;

import org.apache.logging.log4j.CloseableThreadContext.Instance;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "prenom")
    private String prenom;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "dateDeNaissance")
    private Instance dateDeNaissance;
    
    @Column(name = "motDePasse")
    private String motDePasse;
    
    // @ManyToOne
    // @JoinColumn(name = "idAdresse")
    private Adresse adresse;
    
    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idEntreprise")
    private Entreprise entreprise;
}


