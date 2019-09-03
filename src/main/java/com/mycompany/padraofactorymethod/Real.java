package com.mycompany.padraofactorymethod;

public class Real extends Moeda {


    public Real() {
        super.setNome("Real Brasileiro");
    }

    @Override
    public String getSimbolo() {
        return "R$";
    }

    @Override
    public double getCotacao() {
        return super.cotacao / 4.15;
    }

}
