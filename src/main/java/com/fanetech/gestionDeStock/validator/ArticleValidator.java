package com.fanetech.gestionDeStock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.fanetech.gestionDeStock.dto.ArticleDto;


public class ArticleValidator {
    
    public static List<String> validate(ArticleDto articleDto) {
        List<String> errors = new ArrayList<>();

        if(articleDto == null) {
            errors.add("Veuillez renseigne le code de l'article");
            errors.add("Veuillez renseigne la designation de l'article");
            errors.add("Veuillez renseigne le prix uinitaire ht de l'article");
            errors.add("Veuillez renseigne le categorie de l'article");
            return errors;
        }

        if (!StringUtils.hasLength(articleDto.getCodeArticle())) {
            errors.add("Veuillez renseigne le code de l'article");
        }

        if (!StringUtils.hasLength(articleDto.getDesignation())) {
            errors.add("Veuillez renseigne la designation de l'article");
        }

        if (articleDto.getPrixUnitaireHt() == null) {
            errors.add("Veuillez renseigne le prix uinitaire ht de l'article");
        }

        if (articleDto.getPrixUnitaireTtc() == null) {
            errors.add("Veuillez renseigne le prix uinitaire Ttc de l'article");
        }

        if (articleDto.getCategory() == null) {
            errors.add("Veuillez renseigne le categorie de l'article");
        }
        return errors;
    }
}
