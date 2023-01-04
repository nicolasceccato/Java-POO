package application;

import entities.Funcionario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Funcionario x = new Funcionario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        x.nome = scanner.nextLine();

        System.out.println("Digite o salário: ");
        x.salarioBruto = scanner.nextDouble();

        System.out.println("Quanto paga de taxa? ");
        x.taxa = scanner.nextDouble();

        System.out.println(x.toString());

        System.out.println("Qual % aumentar o salário do "+x.nome);
        x.aumentarSalario(scanner.nextDouble());

        System.out.println(x.toString());

    }
}
