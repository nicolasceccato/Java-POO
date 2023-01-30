package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entre os dados do contrato: ");
        Contract contract = new Contract();
        System.out.print("Número: ");
        contract.setNumber(scanner.nextInt());
        System.out.println("Data (dd/MM/yyyy): ");
        contract.setDate(LocalDate.parse(scanner.next(), dateTimeFormatter));
        System.out.println("Entre com o valor total do contrato: ");
        contract.setTotalValue(scanner.nextDouble());

        System.out.println("Digite a quantidade de parcelas: ");
        int n = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }


    }
}