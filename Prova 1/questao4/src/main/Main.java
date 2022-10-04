package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        Removedor removedor = new Removedor();
        Impressora impressora = new Impressora();

        System.out.println("Digite uma String: ");
        String palavra = leitor.lerPalavra();
        String opcao = leitor.escolherOpcao ("1", "2");

        if (opcao.equalsIgnoreCase("1")){
            palavra = removedor.removerConsoante(palavra);
        }else{
            palavra = removedor.removerVogal(palavra);
        }

        impressora.imprimir(palavra);
    }
}
