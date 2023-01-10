package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroDeElementos;


        do{
            System.out.println("Quantos elementos haverá no vetor?");
            numeroDeElementos = scanner.nextInt();
        }while (numeroDeElementos <= 0);

        double[] vetor = new double[numeroDeElementos];
        double maiorElemento = vetor[0];
        int indiceMaiorElemento = 0;
        for (int i = 0; i < numeroDeElementos; i++){
            System.out.println("Digite o " + (i) + " elemento");
            vetor[i] = scanner.nextDouble();
            if (vetor[i] > maiorElemento){
                maiorElemento = vetor[i];
                indiceMaiorElemento = i;
            }
        }
        System.out.println("MAIOR VALOR = " + maiorElemento);
        System.out.println("POSIÇÃO DO MAIOR VALOR = "+ indiceMaiorElemento);

    }
}