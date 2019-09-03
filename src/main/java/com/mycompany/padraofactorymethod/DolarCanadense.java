package com.mycompany.padraofactorymethod;

public class DolarCanadense extends Moeda {

    public DolarCanadense() {
        super.setNome("Dólar Canadense");
    }

    @Override
    public String getSimbolo() {
        return "C$";
    }

    @Override
    public double getCotacao() {
        return super.cotacao * 1.33;
    }

}
