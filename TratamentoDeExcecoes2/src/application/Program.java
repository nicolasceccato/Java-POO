package application;

import entities.Account;


import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        Integer numeroDaConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nome do dono da conta: ");
        String nome = scanner.nextLine();
        System.out.println("Saldo inicial: ");
        Double saldo = scanner.nextDouble();
        System.out.println("Limite de saque inicial: ");
        Double saque = scanner.nextDouble();

        Account account = new Account(numeroDaConta,nome,saldo,saque);

        try{
            System.out.println("Quanto gostaria de sacar?");
            Double tentativaDeSaque = scanner.nextDouble();
            account.withdraw(tentativaDeSaque);
            System.out.println("New balance: " + account.getBalance());


        }catch (UnsupportedOperationException e){
            System.out.println("Você não tem limite suficiente!");
        }catch (SecurityException e){
            System.out.println("Você não tem saldo suficiente");
        }



    }
}
