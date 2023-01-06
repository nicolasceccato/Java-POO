package application;

import entities.Alunos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Alunos a = new Alunos();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        a.nome = scanner.nextLine();
        System.out.println("Digite as 3 notas do aluno");
        a.notas1 = scanner.nextDouble();
        a.notas2 = scanner.nextDouble();
        a.notas3 = scanner.nextDouble();
        System.out.println(a.toString());
    }
}
