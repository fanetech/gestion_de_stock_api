package com.fanetech.gestionDeStock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.fanetech.gestionDeStock.dto.CategoryDto;

public class CategoryValidator {

    public static List<String> validate(CategoryDto categoryDto) {
        List<String> errors = new ArrayList<>();

        if ( categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())) {
            errors.add("Veuillez renseigne le code de la catégorie");
        }
        return errors;
    }

}
