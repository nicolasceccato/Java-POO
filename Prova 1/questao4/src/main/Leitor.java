package main;

import java.util.Locale;
import java.util.Scanner;

public class Leitor {
    public String lerPalavra() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        return s;
    }

    public String escolherOpcao(String s, String s1) {
        Scanner scan = new Scanner(System.in);
        String retorno;
        System.out.println("Digite 1 para retirar consoantes e 2 para retirar vogais: ");
        retorno = scan.nextLine();
        return retorno;
    }
}
