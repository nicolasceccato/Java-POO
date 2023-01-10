import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numeroDeElementos;

        System.out.println("Quantos elementos: ");
        numeroDeElementos = scanner.nextInt();
        double v[] = new double[numeroDeElementos];
        double somaVetor = 0;
        for (int i = 0; i < numeroDeElementos; i++){
            System.out.println("Digite o "+ (i+1) + " elemento");
            v[i] = scanner.nextDouble();
            somaVetor += v[i];

        }
        double media = somaVetor / numeroDeElementos;
        System.out.printf("A MEDIA DO VETOR É IGUAL A %.3f\n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA");

        for (int i = 0; i < numeroDeElementos; i++){
            if (v[i] < media){
                System.out.println(v[i]);
            }
        }

    }
}