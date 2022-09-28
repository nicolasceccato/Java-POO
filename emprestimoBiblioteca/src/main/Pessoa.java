package main;

public class Pessoa {
    private String nome;
    private int cpf;
    private String email;
    protected int tempoEmprestimo = 10;

    public int mostrarTempoEmprestimo(){
        return this.tempoEmprestimo;
    }

    public Pessoa(String nome, int cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTempoEmprestimo() {
        return tempoEmprestimo;
    }

    public void setTempoEmprestimo(int tempoEmprestimo) {
        this.tempoEmprestimo = tempoEmprestimo;
    }
}
