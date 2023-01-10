package application;

import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroDePessoas;
        System.out.println("Quantas pessoas?");
        numeroDePessoas = scanner.nextInt();

        Pessoa[] pessoas = new Pessoa[numeroDePessoas];


        for (int i = 0; i < numeroDePessoas; i++){
            String nome;
            int idade;
            scanner.nextLine();
            System.out.println("Qual o nome da pessoa?");
            nome = scanner.nextLine();
            System.out.println("Qual a idade da pessoa?");
            idade = scanner.nextInt();

            pessoas[i] = new Pessoa(nome,idade);

        }
        int idadeDoMaisVelho = pessoas[0].getIdade();
        int indice = 0;
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i].getIdade() > idadeDoMaisVelho){
                idadeDoMaisVelho = pessoas[i].getIdade();
                indice = i;
            }
        }
        System.out.println("Pessoa mais velha é: " + pessoas[indice].getNome() + " com "+ idadeDoMaisVelho + " anos.");



    }
}