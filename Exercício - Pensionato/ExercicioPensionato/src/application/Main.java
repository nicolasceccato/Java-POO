package application;

import entities.Hospedes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quartosAlugados;
        do {
            System.out.println("Quantos quartos serao alugados:");
            quartosAlugados = scanner.nextInt();
        }while (quartosAlugados <= 0 || quartosAlugados > 10);

        Hospedes[] hospedes = new Hospedes[10];

        for (int i = 1; i <= quartosAlugados; i++){
            scanner.nextLine();
            System.out.println("Digite o nome do " + (i) + " locatário");
            String nome = scanner.nextLine();
            System.out.println("Digite o email do " + (i) + " locatário");
            String email = scanner.next();
            System.out.println("numero quarto: ");
            int numeroQuarto = scanner.nextInt();

            hospedes[numeroQuarto] = new Hospedes(nome, email);

        }
        for (int i = 0; i < 10; i++){
            if (hospedes[i] != null){
                System.out.printf("%d: ", i);
                System.out.println(hospedes[i].toString());
            }
        }


    }
}