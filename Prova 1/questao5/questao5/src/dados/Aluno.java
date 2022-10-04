package dados;

public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, String telefone, String curso) {
        super(nome, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
