package com.mycompany.padraofactorymethod;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class TestaMoeda {

    /**
     * Um array de moedas e um foreach mostrando todos os dados das moedas utilizando 
     * o padrão Factory Method
     * @param args 
     */
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("##.####");
        
        ArrayList<Moeda> moedas = new ArrayList();
        moedas.add(MoedaFactory.criaMoeda(Pais.ARGENTINA));
        moedas.add(MoedaFactory.criaMoeda(Pais.BRASIL));
        moedas.add(MoedaFactory.criaMoeda(Pais.CANADA));
        moedas.add(MoedaFactory.criaMoeda(Pais.ESTADO_SUNIDOS));

        moedas.forEach((m) -> {
            System.out.println("Nome:" + m.getNome() + ", Símbolo:" + m.getSimbolo() + ", Cotação do dia em relação ao Dólar Americano:" + df.format(m.getCotacao()));
        });
    }
}
