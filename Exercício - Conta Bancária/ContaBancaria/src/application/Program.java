package application;

import entities.ContaNoBanco;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numeroDaConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do titular: ");
        String titularDaConta = sc.nextLine();
        System.out.println("Haverá depósito inicial? (s/n)");
        char resposta = sc.next().charAt(0);
        ContaNoBanco c1;
        if (resposta == 's'){
            System.out.println("Digite o deposito inicial: ");
            Double depositoInicial = sc.nextDouble();
            c1 = new ContaNoBanco(numeroDaConta,titularDaConta,depositoInicial);
        }else {

            c1 = new ContaNoBanco(numeroDaConta,titularDaConta);
            c1.dadosBancarios();
        }

        System.out.println("Digite quanto quer depositar: ");
        c1.depositar(sc.nextDouble());

        System.out.println("Digite quanto quer sacar: ");
        c1.sacar(sc.nextDouble());

    }
}
