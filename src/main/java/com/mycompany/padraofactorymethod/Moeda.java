package com.mycompany.padraofactorymethod;

/**
 * Classe abstrata Moeda:
 *
 * Possui o atributo protegito cotação acessível somente as classes filhas usado
 * para construir o cálculo da cotação para cada moeda.
 *
 */
public abstract class Moeda {

    private String nome;
    protected double cotacao = 1.00;

    /**
     * Retorna o simbolo da moeda
     *
     * @return String
     */
    public abstract String getSimbolo();

    /**
     * Retorna a cotação do dia
     *
     * @return Double
     */
    public double getCotacao() {
        return cotacao;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
