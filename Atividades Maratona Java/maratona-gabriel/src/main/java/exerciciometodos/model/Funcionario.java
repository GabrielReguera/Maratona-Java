
package exerciciometodos.model;

import java.util.Arrays;
import javax.swing.plaf.basic.BasicHTML;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;
    
    
    public void imprimirDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(Arrays.toString(this.salario));
    }
    
    public void mediaSalario(double[] salario){
        double media = 0;
        for(double num : salario){
           media += num; 
        }
        System.out.printf("Média dos salários: %.2f %n", (media / salario.length));
    }
    
}
