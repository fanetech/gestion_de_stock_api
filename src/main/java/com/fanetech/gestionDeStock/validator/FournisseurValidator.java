package com.fanetech.gestionDeStock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.fanetech.gestionDeStock.dto.FournisseurDto;

public class FournisseurValidator {

    public static List<String> validate(FournisseurDto fournisseurDto) {
        List<String> errors = new ArrayList<>();

        if(fournisseurDto == null) {
            errors.add("Veuillez renseigne le nom du client");
            errors.add("Veuillez renseigne le prenom du client");
            errors.add("Veuillez renseigne le numero du client");
            errors.add("Veuillez renseigne le mail du client");
            return errors;
        }

        if (!StringUtils.hasLength(fournisseurDto.getName())) {
            errors.add("Veuillez renseigne le nom du client");
        }

        if (!StringUtils.hasLength(fournisseurDto.getPrenom())) {
            errors.add("Veuillez renseigne le prenom du client");
        }

            if (!StringUtils.hasLength(fournisseurDto.getNumTel())) {
                errors.add("Veuillez renseigne le numero du client");
            }

            if (!StringUtils.hasLength(fournisseurDto.getMail())) {
                errors.add("Veuillez renseigne le mail du client");
            }
        
        return errors;
    }
    
}
