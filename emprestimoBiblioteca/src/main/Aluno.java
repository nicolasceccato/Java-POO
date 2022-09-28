package main;

public class Aluno extends Pessoa{
    private String curso;
    private String fase;
    private int matricula;

    @Override
    public int mostrarTempoEmprestimo() {
        return this.getTempoEmprestimo();
    }

    public Aluno(String nome, int cpf, String email, String curso, int matricula) {
        super(nome, cpf, email);
        this.curso = curso;
        this.matricula = matricula;
        this.fase = "0";
        this.tempoEmprestimo = (int) (this.getTempoEmprestimo() + this.getTempoEmprestimo()*(0.4));
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
