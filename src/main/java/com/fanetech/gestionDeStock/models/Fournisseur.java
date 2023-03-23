package com.fanetech.gestionDeStock.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity {
    @Column(name = "nom")
    private String name;
    
    @Column(name = "prenom")
    private String prenom;
    
    @Column(name = "photo")
    private String photo;
    
    // @Embedded
    // private String adresse;
    
    @Column(name = "mail")
    private String mail;
    
    @Column(name = "numTel")
    private String numTel;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;
}
