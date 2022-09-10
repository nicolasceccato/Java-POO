package Main;

import java.util.Scanner;
/*Escreva um programa em que o usuario entra com uma String e escolhe se deseja
remover apenas as vogais ou apenas as consoantes dessa String. Apresente a String
resultante na tela.*/
public class Main {
    public static void main(String[] args) {
        Redutor redutor = new Redutor();
        Impressora impressora = new Impressora();
        Leitor leitor = new Leitor();

        String palavra = new String();
        System.out.println("Digite uma string:");
        palavra = leitor.lerNovaString();
        String opcao = new String();
        opcao = leitor.escolherOpcao("vogal", "consoante");
        if(opcao.equalsIgnoreCase("vogal")){
            palavra = redutor.retirarVogais(palavra);
        }else{
            if (opcao.equalsIgnoreCase("consoante")){
                palavra = redutor.retirarConsoantes(palavra);
            }
        }
        impressora.imprimir(palavra);
    }
}
