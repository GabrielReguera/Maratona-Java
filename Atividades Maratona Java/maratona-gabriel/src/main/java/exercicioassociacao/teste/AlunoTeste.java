package exercicioassociacao.teste;

import exercicioassociacao.model.Aluno;
import exercicioassociacao.model.Local;
import exercicioassociacao.model.Seminario;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Roberto", 15);
        Aluno aluno2 = new Aluno("Igor", 15);
        Local local = new Local("Avenida Cruzeiro");
        Seminario seminario = new Seminario("Geografia", local);
        
        Aluno[] alunos = {aluno1, aluno2};
        
        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        seminario.setAlunos(alunos);
        
        
        aluno1.imprime();
        aluno2.imprime();
        
    }
}
