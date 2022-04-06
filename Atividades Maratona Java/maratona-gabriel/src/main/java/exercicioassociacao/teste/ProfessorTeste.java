package exercicioassociacao.teste;

import exercicioassociacao.model.Local;
import exercicioassociacao.model.Professor;
import exercicioassociacao.model.Seminario;

public class ProfessorTeste {
    public static void main(String[] args) {
        Local local = new Local("Avenida Cruzeiro");
        Seminario seminario1 = new Seminario("Geografia", local);
        Seminario seminario2 = new Seminario("Protuguês", local);
        Seminario[] seminarios = {seminario1, seminario2};
        Professor professor1 = new Professor("Silvio", "Português", seminarios);

        
        professor1.imprime();
        
        
        
    }

}
