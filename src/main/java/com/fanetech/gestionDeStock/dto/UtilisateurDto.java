package com.fanetech.gestionDeStock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {

    private Integer id;
    
    private String nom;
}
