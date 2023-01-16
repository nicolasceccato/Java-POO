import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int linhas = scanner.nextInt();
        System.out.println("Digite a quantidade de colunas");
        int colunas = scanner.nextInt();


        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("M[%d][%d]: \n", i+1, j+1);
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Qual valor da matriz você quer rastrear: ");
        int rastreado = scanner.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == rastreado){
                    System.out.println("Posição: " + i + ", " + j);
                    if (j > 0){
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }if (j < matriz[i].length - 1){
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }if (i > 0){
                        System.out.println("Cima: " + matriz[i-1][j]);
                    }if (i < matriz.length - 1){
                        System.out.println("Baixo: " + matriz[i+1][j]);
                    }
                }
            }
        }


    }
}