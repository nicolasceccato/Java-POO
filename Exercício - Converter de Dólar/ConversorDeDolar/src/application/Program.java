package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double dolar, quantosDolares, qtsReais;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do dolar hoje?");
        dolar = scanner.nextDouble();
        System.out.println("Quantos dolares ira comprar?");
        quantosDolares = scanner.nextDouble();

        qtsReais = CurrencyConverter.converter(quantosDolares,dolar);
        System.out.println(qtsReais);

    }
}
