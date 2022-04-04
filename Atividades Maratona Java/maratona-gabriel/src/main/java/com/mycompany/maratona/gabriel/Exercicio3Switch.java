package com.mycompany.maratona.gabriel;

public class Exercicio3Switch {

    public static void main(String[] args) {

        int fimsemana = 5;
        switch (fimsemana) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Dígite um Número de 1 a 7");
                break;
        }

    }
}
