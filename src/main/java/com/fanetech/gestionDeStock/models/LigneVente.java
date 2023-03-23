package com.fanetech.gestionDeStock.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table(name = "ligneVente")
public class LigneVente extends AbstractEntity {
    
    @ManyToOne
    @JoinColumn(name = "idVente")
    private Ventes ventes;

    private BigDecimal quantite;
}
