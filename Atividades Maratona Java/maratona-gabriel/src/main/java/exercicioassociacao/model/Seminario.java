package exercicioassociacao.model;

public class Seminario {
    
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public Seminario(Aluno[] alunos) {
        this.alunos = alunos;
    }
    

    public void imprime(){
        System.out.println("Titulo: " +this.titulo + "\nEndereço: " + local.getEndereco());
        if(alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println("Nome Aluno: " + aluno.getNome() + " --Idade: " + aluno.getIdade());
        }
        
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    
}
