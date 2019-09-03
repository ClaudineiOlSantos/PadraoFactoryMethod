package com.mycompany.padraofactorymethod;

public class DolarAmericano extends Moeda {
    
    public DolarAmericano() {
        super.setNome("Dólar Americano");
    }
    
    @Override
    public String getSimbolo() {
        return "USD";
    }
    
}
