package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Biblioteca {
    public static ArrayList <Pessoa> listaDePessoas = new ArrayList<Pessoa>();

    public static void listaProfessores(){
        for(Pessoa p : listaDePessoas ){
            if (p instanceof Professor){
                System.out.println("\n Professor: " + p.getNome());
            }
        }
    }
    public static void listaAlunos(){
        for(Pessoa p : listaDePessoas ){
            if (p instanceof Aluno){
                System.out.println("\n Aluno: " + p.getNome());
            }
        }
    }
    public static void listaProfessoresSalario(float salario){
        for(Pessoa p : listaDePessoas ){
            if (p instanceof Professor){
                if (((Professor) p).getSalario() >= salario){
                    System.out.println("\n Professor " + p.getNome() + "ganha " + ((Professor) p).getSalario() + " de salario");
                }
            }
        }
    }
    public void cadastrarProfessor(String nome, int cpf, String email, String formacao, float salario, String departamento){
        listaDePessoas.add(new Professor(nome, cpf,email, formacao, salario, departamento));
    }
    public void cadastrarAluno(String nome, int cpf, String email, String curso, int matricula){
        listaDePessoas.add(new Aluno(nome, cpf,email, curso, matricula));
    }
    public void cadastrarPessoa(String nome, int cpf, String email){
        listaDePessoas.add(new Pessoa(nome, cpf,email));
    }
    public int mostrarTempoEmprestimo(Pessoa pessoa){
        return pessoa.mostrarTempoEmprestimo();
    }

}
