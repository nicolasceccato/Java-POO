package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos elementos haverá no vetor? ");
        int numeroDeElementos = scanner.nextInt();

        int[] a = new int[numeroDeElementos];
        int[] b = new int[numeroDeElementos];
        int[] c = new int[numeroDeElementos];

        for (int i = 0; i < numeroDeElementos; i++){
            System.out.println("Digite o " + (i+1) + " elemento de a[]");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeroDeElementos; i++){
            System.out.println("Digite o " + (i+1) + " elemento de b[]");
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeroDeElementos; i++){
            c[i] = a[i] + b[i];
        }
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < numeroDeElementos; i++){
            System.out.println(c[i]);
        }

    }
}