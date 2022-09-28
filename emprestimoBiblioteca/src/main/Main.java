package main;

import static main.Biblioteca.*;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 10,"carlos@gmail.com");
        Aluno a1 = new Aluno("Joao", 11, "joao@yahoo.com.br", "Marcenaria", 1);
        Professor pr1 = new Professor("Alberta", 2,"alberta@hotmail.com", "Matemática", 7800.50f, "Ciências exatas" );

        System.out.println("a pessoa " + p1.getNome() + " tem direito a "
                + p1.mostrarTempoEmprestimo() + " dias de emprestimo");
        System.out.println("a pessoa " + a1.getNome() + " tem direito a "
                + a1.mostrarTempoEmprestimo() + " dias de emprestimo");
        System.out.println("a pessoa " + pr1.getNome() + " tem direito a "
                + pr1.getTempoEmprestimo() + " dias de emprestimo");

        listaDePessoas.add( new Pessoa("Mario", 55, "nao tem"));
        listaDePessoas.add( new Professor("Mariano", 550, "mariano@yahoo.com.br","Computação", 5000.1f, "Computação"));
        listaDePessoas.add( new Aluno("Mariana", 50, "mariana@yahoo.com.br","Computação", 5000));
        listaDePessoas.add((p1));
        listaDePessoas.add((a1));
        listaDePessoas.add((pr1));
        listaAlunos();
        listaProfessores();
        listaProfessoresSalario(3050f);


    }
}
