package Main;

import java.util.Scanner;

public class Leitor {
    public String lerNovaString() {
        String retorno = new String();
        Scanner scan = new Scanner(System.in);
        retorno = scan.nextLine();
        return retorno;
    }

    public String escolherOpcao(String vogal, String consoante) {
        String opcaoEscolhida = new String();
        System.out.println("Digite a opcao que deseja remover da sua string: ");
        System.out.println("vogal");
        System.out.println("consoante");
        Scanner scan = new Scanner(System.in);
        opcaoEscolhida = scan.nextLine();
        return opcaoEscolhida;
    }
}
