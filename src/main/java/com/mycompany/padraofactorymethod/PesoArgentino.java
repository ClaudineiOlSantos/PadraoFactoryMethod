package com.mycompany.padraofactorymethod;

public class PesoArgentino extends Moeda {
    
    public PesoArgentino() {
        super.setNome("Peso Argentino");
    }
    
    @Override
    public String getSimbolo() {
        return "$";
    }
    
    @Override
    public double getCotacao() {
        return super.cotacao / 55.7;
    }
    
}
