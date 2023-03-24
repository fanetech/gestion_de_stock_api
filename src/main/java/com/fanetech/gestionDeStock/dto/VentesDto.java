package com.fanetech.gestionDeStock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VentesDto {

    private Integer id;
    
    private String code;
}
