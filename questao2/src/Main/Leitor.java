package Main;

import java.util.Scanner;

public class Leitor {
    public int[] lerVetor() {
        int[] retorno = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %do termo do vetor ", i + 1 );
            Scanner scan = new Scanner(System.in);
            retorno[i] = scan.nextInt();
        }
        return retorno;
    }

}