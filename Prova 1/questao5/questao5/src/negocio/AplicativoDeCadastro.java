package negocio;

import dados.Aluno;
import dados.Pessoa;
import dados.Professor;

import java.util.ArrayList;
import java.util.Scanner;

public class AplicativoDeCadastro {

    //Scanner scan = new Scanner(System.in);

    public static ArrayList <Pessoa> listaDePessoas = new ArrayList<Pessoa>();


    public String listaProfessor() {
        String resultado = "";
        for (Pessoa p : listaDePessoas) {
            if (p instanceof Professor) {
                resultado = resultado + p.getNome() + "\n";
            }
        }
        return resultado;
    }

    public void adicionarProfessor(Professor p1) {
            listaDePessoas.add(p1);
    }

    public String listaAluno() {
        String resultado = "";
        for (Pessoa p : listaDePessoas){
            if (p instanceof Aluno){
                resultado = resultado + p.getNome() + "\n";
            }
        }
        return resultado;
    }

    public void adicionarAluno(Aluno a1) {
        listaDePessoas.add(a1);
    }


}
