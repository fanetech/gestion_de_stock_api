package com.fanetech.gestionDeStock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.fanetech.gestionDeStock.dto.UtilisateurDto;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDto utilisateurDto) {
        List<String> errors = new ArrayList<>();

        if ( utilisateurDto == null ) {
            errors.add("Veuillez renseigne le nom de l'utilisateur");
            errors.add("Veuillez renseigne le prenom de l'utilisateur");
            errors.add("Veuillez renseigne le adresse de l'utilisateur");
            errors.add("Veuillez renseigne le adresse de l'utilisateur");
            return errors;
        }

        if ( utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getNom())) {
            errors.add("Veuillez renseigne le nom de l'utilisateur");
        }

        if (!StringUtils.hasLength(utilisateurDto.getPrenom())) {
            errors.add("Veuillez renseigne le prenom de l'utilisateur");
        }

        if (!StringUtils.hasLength(utilisateurDto.getEmail())) {
            errors.add("Veuillez renseigne l'email de l'utilisateur");
        }

        if (utilisateurDto.getDateDeNaissance() == null) {
            errors.add("Veuillez renseigne la date de naissance de l'utilisateur");
        }

        if (utilisateurDto.getAdresse() == null) {

            errors.add("Veuillez renseigne le adresse de l'utilisateur");

        }else{

            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1())) {
                errors.add("Le champs 'adresse 1' est obligatore");
            }
            
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getVille())) {
                errors.add("Le champs 'ville' est obligatore");
            }
            
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostale())) {
                errors.add("Le champs 'code postale' est obligatore");
            }
            
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getPays())) {
                errors.add("Le champs 'pays' est obligatore");
            }

        }

        return errors;
    }
    
}
