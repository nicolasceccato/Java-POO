package application;

import entities.BrazilInterestService;
import entities.InteresetService;
import entities.UsaInterestService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Emprestimo no Brasil ou nos EUA? ");
        String respota = scanner.nextLine();

        System.out.println("Qual a quantia de empréstimo? ");
        Double quantia = scanner.nextDouble();

        System.out.println("Quantos meses de empréstimo? ");
        int meses = scanner.nextInt();

        if (respota.equals("Brasil")){
            InteresetService interesetService = new BrazilInterestService();
            Double total = interesetService.payment(quantia,meses);
            System.out.println("O valor total a ser pago no empréstimo BR será igual a " + String.format("%.2f", total));
        }else{
            InteresetService interesetService = new UsaInterestService();
            Double total = interesetService.payment(quantia,meses);
            System.out.println("O valor total a ser pago no empréstimo US será igual a " + String.format("%.2f", total));
        }

    }
}
