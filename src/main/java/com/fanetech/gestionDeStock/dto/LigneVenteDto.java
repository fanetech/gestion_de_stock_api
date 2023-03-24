package com.fanetech.gestionDeStock.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVenteDto {

    private Integer id;
    
    private VentesDto ventes;

    private BigDecimal quantite;
}
