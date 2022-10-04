package main;

import dados.Aluno;
import dados.Professor;
import negocio.AplicativoDeCadastro;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static AplicativoDeCadastro app = new AplicativoDeCadastro();
    public static void main(String[] args) {
        Menu menu = new Menu();

        int opcao = -1;

        do {
            opcao = menu.mostraOpcoesERetornaASelecionada();
            realizeOperacao(opcao);
        }while(opcao != 5);

    }
    private static void addProfessor() {
        System.out.println("Qual o nome do professor: ");
        String nomeProf = scan.nextLine();
        System.out.println("Qual o telefone do professor: ");
        String teleProf = scan.nextLine();
        System.out.println("Quantas materias esse professor leciona (de 1 a 3):  ");
        int quantidadeDeMaterias = Integer.parseInt(scan.nextLine());
        String[] materias = new String[quantidadeDeMaterias];
        for (int i = 0; i < quantidadeDeMaterias; i++){
            System.out.printf("Digite a %d materia\n", i+1);
            materias[i] = scan.nextLine();
        }
        Professor p1 = new Professor(nomeProf, teleProf, materias);
        app.adicionarProfessor(p1);
    }
    private static void addAluno() {
        System.out.println("Qual o nome do aluno: ");
        String nomeAluno = scan.nextLine();
        System.out.println("Qual o telefone do aluno: ");
        String teleAluno = scan.nextLine();
        System.out.println("Qual o curso do aluno:  ");
        String cursoAluno = scan.nextLine();
        Aluno a1 = new Aluno(nomeAluno, teleAluno, cursoAluno);
        app.adicionarAluno(a1);
    }
    public static void realizeOperacao(int opcao) {
        switch (opcao){
            case 1:
                addAluno();
                break;
            case 2:
                System.out.println(app.listaAluno());
                break;
            case 3:
                addProfessor();
                break;
            case 4:
                System.out.println(app.listaProfessor());
                break;
            default:
                break;
        }
    }

}
