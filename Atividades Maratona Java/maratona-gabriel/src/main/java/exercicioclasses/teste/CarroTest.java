
package exercicioclasses.teste;

import exercicioclasses.model.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Monza";
        carro.modelo = "SL";
        carro.ano = "1994-1998";
        
        Carro carro2 = new Carro();
        carro2.nome = "350Z";
        carro2.modelo = "GT-R"; 
        carro2.ano = "2002-2006";
        
        System.out.println("Nós temos Os seguintes Carros \n --------------");
        System.out.println(carro.nome + " Modelo:" + carro.modelo + " Ano:" + carro.ano);
        System.out.println(carro2.nome + " Modelo:" + carro2.modelo + " Ano:" + carro2.ano);
    }
}
