package com.mycompany.padraofactorymethod;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class TestaMoeda {

    /**
     * Um array de moedas e um foreach mostrando todos os dados das moedas
     * utilizando o padrão Factory Method
     *
     * @param args
     */
    public static void main(String[] args) {
        //Formatação do resultado
        DecimalFormat df = new DecimalFormat("##.####");

        try {
            ArrayList<Moeda> moedas = new ArrayList();
            moedas.add(MoedaFactory.criaMoeda(Pais.ARGENTINA.classe));
            moedas.add(MoedaFactory.criaMoeda(Pais.BRASIL.classe));
            moedas.add(MoedaFactory.criaMoeda(Pais.CANADA.classe));
            moedas.add(MoedaFactory.criaMoeda(Pais.ESTADOS_UNIDOS.classe));

            moedas.forEach((m) -> {
                System.out.println("Nome:" + m.getNome() + ", Símbolo:" + m.getSimbolo() + ", Cotação do dia em relação ao Dólar Americano:" + df.format(m.getCotacao()));
            });
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println("Classe não encontrada, por favor verifique se o nome da classe desejada foi adicionada corretamente ao Enum Pais");
        }
    }
}
