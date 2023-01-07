package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoDoVetor;
        do {
            System.out.println("Quantos numeros você vai digitar? (1/10) ");
            tamanhoDoVetor = scanner.nextInt();
        }while (tamanhoDoVetor <= 0 || tamanhoDoVetor > 10);

        double[] vetor = new double[tamanhoDoVetor];

        double soma = 0;
        double media = 0;
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }
        media = soma/vetor.length;
        System.out.printf("VALORES = ");
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("%.1f ", vetor[i]);
        }
        System.out.println();
        System.out.println("SOMA = "+ soma);
        System.out.println("MÉDIA = "+ media);


    }
}
