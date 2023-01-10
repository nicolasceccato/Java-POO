package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeElementos;

        System.out.println("quantos elementos? ");
        numeroDeElementos = scanner.nextInt();

        int[] v = new int[numeroDeElementos];

        int contPar = 0;
        int somaPar = 0;
        for(int i = 0 ; i < numeroDeElementos; i++){
            System.out.println("Digite o " + (i+1) + " elemento");
            v[i] = scanner.nextInt();
            if (v[i] % 2 ==0) {
                contPar++;
                somaPar += v[i];
            }
        }
        if (contPar == 0){
            System.out.println("NENHUM NUMERO PAR");
            return;
        }else {
            double mediaPares = (double) somaPar/contPar;
            System.out.println("MEDIA DOS PARES = " + mediaPares);
        }



    }
}