package com.mycompany.padraofactorymethod;

public class MoedaFactory {

    /**
     * Metodo fábrica CriaMoeda é o ponto principal deste padrão, pois através
     * dele a criação dos objetos do tipo moeda fica encapsulado dentro do
     * mesmo, deixando a complexidade de criar novos objetos contido na mesma
     * lógica. Desta forma a família de moedas pode crescer mas a criação de
     * novos objetos continuará simples.
     *
     * Ainda acho que deveria ter uma loop para decidir qual tipo de moeda
     * instanciar, mas vamos aguardar até que o Professor Daniel de seu parecer.
     *
     * @param className
     * @return
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static Moeda criaMoeda(String className) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Retorna uma instancia da classe passada no className
        Class classe = Class.forName(className);
        return (Moeda) classe.newInstance();
        
//        System.out.println(pais.name());
//        if (null == pais) {
//            return new DolarAmericano();
//        } else {
//            switch (pais) {
//                case ARGENTINA:
//                    return new PesoArgentino();
//                case BRASIL:
//                    return new Real();
//                case CANADA:
//                    return new DolarCanadense();
//                default:
//                    return new DolarAmericano();
//            }
//        }

    }
}
