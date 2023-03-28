package com.fanetech.gestionDeStock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.fanetech.gestionDeStock.dto.ClientDto;


public class ClientValidator {

    public static List<String> validate(ClientDto clientDto) {
        List<String> errors = new ArrayList<>();

        if(clientDto == null) {
            errors.add("Veuillez renseigne le nom du client");
            errors.add("Veuillez renseigne le prenom du client");
            errors.add("Veuillez renseigne le numero du client");
            errors.add("Veuillez renseigne le mail du client");
            return errors;
        }

        if (!StringUtils.hasLength(clientDto.getName())) {
            errors.add("Veuillez renseigne le nom du client");
        }

        if (!StringUtils.hasLength(clientDto.getPrenom())) {
            errors.add("Veuillez renseigne le prenom du client");
        }

            if (!StringUtils.hasLength(clientDto.getNumTel())) {
                errors.add("Veuillez renseigne le numero du client");
            }

            if (!StringUtils.hasLength(clientDto.getMail())) {
                errors.add("Veuillez renseigne le mail du client");
            }
        
        return errors;
    }
    
}
