package com.mycompany.maratona.gabriel;

public class Exercicio6Break {

    public static void main(String[] args) {
        double valorCarro = 50000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(parcela + "Parcelas de " + "R$" + valorParcela);

        }
    }

}
