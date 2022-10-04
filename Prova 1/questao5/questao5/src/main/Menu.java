package main;

import java.util.Scanner;

public class Menu {
    public int mostraOpcoesERetornaASelecionada() {
        int selecionada = -1;

        System.out.println("1. Adicionar Aluno");
        System.out.println("2. Listar Aluno");
        System.out.println("3. Adicionar Professor");
        System.out.println("4. Listar Professor");
        System.out.println("5. Sair");

        System.out.println("Escolha sua opcao:");
        Scanner scanner = new Scanner(System.in);
        selecionada = scanner.nextInt();

        return selecionada;
    }
}