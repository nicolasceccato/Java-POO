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

        int[] vetor = new int[tamanhoDoVetor];
        for (int i = 0; i < tamanhoDoVetor; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = scanner.nextInt();
        }
        boolean temNegativo = false;
        for (int i = 0; i < tamanhoDoVetor; i++){
            if (vetor[i] < 0){
                temNegativo = true;
            }
        }
        if (temNegativo){
            System.out.println("NÚMEROS NEGATIVOS: ");
            for (int i = 0; i < tamanhoDoVetor; i++){
                if (vetor[i] < 0) {
                    System.out.println(vetor[i]);
                }
            }
        }



    }
}
