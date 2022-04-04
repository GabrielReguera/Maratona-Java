
package com.mycompany.maratona.gabriel;


public class Exercicio2IfElse {
    public static void main(String[] args) {
        
        double salarioAnual = 70000;
        if(salarioAnual <= 34712){
            System.out.println("Total a pagar de Imposto é R$" + (salarioAnual * 0.097));
        }else if(salarioAnual <= 68507){
            System.out.println("Total a pagar de Imposto é R$"+ (salarioAnual * 0.3735));
        }else{
            System.out.println("Total a pagare de Imposto é R$"+ (salarioAnual * 0.4950));
        }
        
        
        
    }
}
