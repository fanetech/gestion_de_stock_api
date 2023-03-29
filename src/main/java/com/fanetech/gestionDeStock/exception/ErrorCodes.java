package com.fanetech.gestionDeStock.exception;

public enum ErrorCodes {
    ARTICLE_NO_FOUND(1000),
    ARTICLE_NO_VALID(1001),
    CATEGORY_NO_FOUND(2000),
    CLIENT_NO_FOUND(3000),
    COMMANDE_CLIENT_NO_FOUND(4000),
    COMMANDE_FOURNISSEUR_NO_FOUND(5000),
    ENTREPRISE_NO_FOUND(6000),
    LIGNE_COMMANDE_CLIENT_NO_FOUND(7000),
    LIGNE_COMMANDE_FOURNISSEUR_NO_FOUND(8000),
    LIGNE_VENTE_NO_FOUND(9000),
    MVT_STK_NO_FOUND(10000),
    UTILISATEUR_NO_FOUND(11000),
    VENTE_NO_FOUND(13000)

    ;

    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
