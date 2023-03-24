package com.fanetech.gestionDeStock.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FournisseurDto {

    private Integer id;
    
    private String name;
    
    private String prenom;
    
    private String photo;
    
    private AdresseDto adresse;
    
    private String mail;
    
    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseurs;
}
