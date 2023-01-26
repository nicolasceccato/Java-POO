package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos contribuintes serão cadastrados: ");
        int numeroDeContribuintes = scanner.nextInt();
        List<Contribuinte> listaDeContribuintes = new ArrayList<>();

        for(int i = 0; i < numeroDeContribuintes; i++){
            System.out.print("Pessoa física ou jurídica (f/j): ");
            char tipoPessoa = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Renda: ");
            Double renda = scanner.nextDouble();

            if (tipoPessoa == 'f'){
                System.out.print("Gastos médicos: ");
                Double gastos = scanner.nextDouble();
                listaDeContribuintes.add(new PessoaFisica(nome, renda, gastos));
            }else {
                System.out.println("Número de fúncionários: ");
                int numeroDeFuncionarios = scanner.nextInt();
                listaDeContribuintes.add(new PessoaJuridica(nome,renda,numeroDeFuncionarios));
            }
        }
        System.out.println();
        System.out.println("------------- IMPOSTOS PAGOS -------------");
        System.out.println();
        for (Contribuinte contribuinte : listaDeContribuintes){
            System.out.println(contribuinte.getName() + ": $ "+ String.format("%.2f",  contribuinte.calculaImposto()));
        }
        System.out.println();
        System.out.println("------------- TOTAL DE IMPOSTOS -------------");
        System.out.println();

        Double sum = 0.0;
        for (Contribuinte contribuinte : listaDeContribuintes){
            sum += contribuinte.calculaImposto();
        }
        System.out.println("TOTAL DE IMPOSTOS = $ " + String.format("%.2f",sum));

    }
}
