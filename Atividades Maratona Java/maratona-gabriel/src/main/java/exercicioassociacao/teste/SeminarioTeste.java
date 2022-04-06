package exercicioassociacao.teste;

import exercicioassociacao.model.Aluno;
import exercicioassociacao.model.Local;
import exercicioassociacao.model.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno[] alunos = {aluno1};
        Local local = new Local("Avenida Cruzeiro");
        Seminario seminario = new Seminario("Geografia", local, alunos);
        
        seminario.imprime();
    }
}   
