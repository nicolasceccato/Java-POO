package main;

public class Professor extends Pessoa{
    private String formacao;
    private float salario;
    private String departamento;

    public int mostrarTempoEmprestimo() {
        return this.getTempoEmprestimo();
    }
    public Professor(String nome, int cpf, String email, String formacao, float salario, String departamento) {
        super(nome, cpf, email);
        this.formacao = formacao;
        this.salario = salario;
        this.departamento = departamento;
        this.tempoEmprestimo = (int) (this.getTempoEmprestimo() + this.getTempoEmprestimo()*(0.7));

    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
