package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerador gerador = new Gerador();
        Impressora impressora = new Impressora();

        int quantidade;


        System.out.println("Digite a quantidade de termos que deseja na sequencia Fibonacci");
        Scanner scan = new Scanner(System.in);
        quantidade = scan.nextInt();

        int [] sequencia = gerador.gerarSequenciaDe(quantidade);
        int somatorio = gerador.somarSequencia(sequencia, quantidade);

        impressora.imprimir(sequencia, quantidade, somatorio);

    }
}
