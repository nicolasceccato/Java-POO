package application;

import entities.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas deseja informar: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Pessoa[] vetorDePessoas = new Pessoa[n];
        for (int i = 0; i < vetorDePessoas.length; i++) {
            System.out.printf("Digite o nome da %d pessoa: ", i + 1);
            String nome = new String();
            nome = scanner.nextLine();

            System.out.printf("Digite a idade da %d pessoa\n", i + 1);
            int idade = scanner.nextInt();

            System.out.printf("Digite a altura da %d pessoa\n", i + 1);
            double altura = scanner.nextDouble();
            scanner.nextLine();


            vetorDePessoas[i] = new Pessoa();
            vetorDePessoas[i].setNome(nome);
            vetorDePessoas[i].setIdade(idade);
            vetorDePessoas[i].setAltura(altura);
        }
        double alturaMedia;
        double somaAltura = 0;
        int contAbaixoDezesseis = 0;
        for (int i = 0; i < vetorDePessoas.length; i++) {
            somaAltura += vetorDePessoas[i].getAltura();
            if (vetorDePessoas[i].getIdade() < 16) {
                contAbaixoDezesseis++;
            }

        }
        alturaMedia = somaAltura / vetorDePessoas.length;
        double porcentagem = (double)((contAbaixoDezesseis*100)/vetorDePessoas.length);
        System.out.printf("A altura media das %d pessoas é igual a : %f\n", vetorDePessoas.length, alturaMedia);
        System.out.printf("Entre as %d pessoas %d tem menos que 16 anos, ou seja %.2f  \n", vetorDePessoas.length, contAbaixoDezesseis, porcentagem);
        for (int i = 0; i < vetorDePessoas.length; i++) {
            if (vetorDePessoas[i].getIdade() < 16) {
                System.out.println(vetorDePessoas[i].getNome());
            }
        }
    }
}