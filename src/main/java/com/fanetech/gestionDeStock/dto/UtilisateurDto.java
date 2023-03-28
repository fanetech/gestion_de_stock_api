package com.fanetech.gestionDeStock.dto;

import org.apache.logging.log4j.CloseableThreadContext.Instance;

import com.fanetech.gestionDeStock.models.Adresse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {

    private Integer id;
    
    private String nom;

    private String prenom;

    private String email;

    private Instance dateDeNaissance;

    private String motDePasse;

    private Adresse adresse;

    private String photo;

    private EntrepriseDto entreprise;
}
