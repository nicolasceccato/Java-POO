package application;

import entities.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroDeAlunos;

        System.out.println("Quantos alunos? ");
        numeroDeAlunos = scanner.nextInt();
        Aluno[] alunos = new Aluno[numeroDeAlunos];

        for (int i = 0; i < numeroDeAlunos; i++){
            scanner.nextLine();
            System.out.println("Digite o nome do aluno: ");
            String nomeDoAluno = scanner.nextLine();
            System.out.println("Digite a nota 1 do aluno: ");
            double nota1 = scanner.nextDouble();
            System.out.println("Digite a nota 2 do aluno: ");
            double nota2 = scanner.nextDouble();

            alunos[i] = new Aluno(nomeDoAluno,nota1,nota2);

        }
        System.out.println("APROVADOS");
        for (int i = 0; i < numeroDeAlunos; i++){
            if (alunos[i].getMedia() >= 6){
                System.out.println(alunos[i].getNome());
            }
        }

    }
}