package com.fanetech.gestionDeStock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvtStkDto {

    private Integer id;
    
    private ArticleDto article;
}
