package application;

import entities.Account;
import entities.exceptions.BalanceException;
import entities.exceptions.LimitException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

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


        }catch (LimitException e){
            System.out.println(e.getMessage());
        }catch (BalanceException e){
            System.out.println(e.getMessage());
        }



    }
}
