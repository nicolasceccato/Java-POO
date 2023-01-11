package application;

import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas: ");

        int numeroDePessoas = scanner.nextInt();

        Pessoa[] pessoas = new Pessoa[numeroDePessoas];

        for (int i = 0; i < numeroDePessoas; i++){
            System.out.println("Digite a altura da " + (i+1) + " pessoa");
            double altura = scanner.nextDouble();
            System.out.println("Digite o genero da " + (i+1) + " pessoa");
            char genero = scanner.next().charAt(0);

            pessoas[i] = new Pessoa(altura, genero);

        }
        int numeroDeHomens = 0;
        int numeroDeMulheres = 0;
        double mediaAlturaMulheres;
        double somaAlturaMulheres = 0;
        int indiceMenor = 0;
        int indiceMaior = 0;
        for (int i = 0; i < numeroDePessoas; i++){
            if (pessoas[i].getAltura() < pessoas[indiceMenor].getAltura()){
                indiceMenor = i;
            }
            if (pessoas[i].getAltura() > pessoas[indiceMaior].getAltura()){
                indiceMaior = i;
            }
            if (pessoas[i].getGenero() == 'M' || pessoas[i].getGenero() == 'm'){
                numeroDeHomens++;
            }else {
                numeroDeMulheres++;
                somaAlturaMulheres = somaAlturaMulheres + pessoas[i].getAltura();
            }
        }
        mediaAlturaMulheres = somaAlturaMulheres/numeroDeMulheres;
        System.out.println("Menor altura = " + pessoas[indiceMenor].getAltura());
        System.out.println("Maior altura = " + pessoas[indiceMaior].getAltura());
        System.out.println("Media das alturas das mulheres = "+ mediaAlturaMulheres);
        System.out.println("Numero de homens = "+numeroDeHomens);
    }
}