
package exerciciometodos.Teste;

import exerciciometodos.model.Funcionario;


public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        
        funcionario.nome = "Fabinho";
        funcionario.idade = 23;
        funcionario.salario = new double[]{1500,350,10.50};
        
        funcionario.imprimirDados();
        funcionario.mediaSalario(funcionario.salario);
    }
}
    