package com.mycompany.padraofactorymethod;

/**
 * Enumeração de todas as classes que extendem de Moeda
 * 
 * Toda classe que for criada como filha de Moeda sua constante deve ser obrigatóriamente 
 * adicionada á este Enum, para que sua instancia seja feita de forma dinamica pela classe
 * MoedaFactory 
 */
public enum Pais {
    BRASIL("com.mycompany.padraofactorymethod.Real"),
    ESTADOS_UNIDOS("com.mycompany.padraofactorymethod.DolarAmericano"),
    CANADA("com.mycompany.padraofactorymethod.DolarCanadense"),
    ARGENTINA("com.mycompany.padraofactorymethod.PesoArgentino");

    public String classe;

    Pais(String classe) {
        this.classe = classe;
    }
}
