package dados;

public class Professor extends Pessoa {
    private String[] materiasLecionadas;


    public Professor(String nome, String telefone, String[] materiasLecionadas) {
        super(nome, telefone);
        this.materiasLecionadas = materiasLecionadas;
    }

    public String[] getMateriasLecionadas() {
        return materiasLecionadas;
    }

    public void setMateriasLecionadas(String[] materiasLecionadas) {
        this.materiasLecionadas = materiasLecionadas;
    }
}
