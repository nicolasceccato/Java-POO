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

        int contPar = 0;
        int[] vetor = new int[tamanhoDoVetor];
        for (int i = 0; i < tamanhoDoVetor; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0){
                contPar++;
            }
        }
        if (contPar > 0){

            System.out.println("NÚMEROS PARES: ");
            for (int i = 0; i < vetor.length; i++){
                if (vetor[i] % 2 == 0){
                    System.out.printf("%d ", vetor[i]);

                }
            }
            System.out.println("QUANTIDADE DE PARES = " + contPar);
        }
    }
}
