package com.fanetech.gestionDeStock.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@EqualsAndHashCode
public class Adresse extends AbstractEntity{
    
    @Column(name = "adresse1")
    private String adresse1;
    
    @Column(name = "adresse2")
    private String adresse2;
    
    @Column(name = "ville")
    private String ville;
    
    @Column(name = "codePostale")
    private String codePostale;
    
    @Column(name = "pays")
    private String pays;
}
