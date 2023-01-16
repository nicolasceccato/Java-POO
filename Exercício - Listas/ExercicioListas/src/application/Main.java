package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos funcionarios serão cadastrados? ");
        int numeroDeFuncionarios = scanner.nextInt();

        List<Funcionario> listaDeFuncionario = new ArrayList<>();

        for (int i = 0; i < numeroDeFuncionarios; i++) {

            System.out.println("Digite o id do novo funcionario: ");
            int id = scanner.nextInt();
            while (jaTemEsseId(listaDeFuncionario, id) != -1){
                System.out.println("Essa id ja foi adionada a um funcionario! Digite outra: ");
                id = scanner.nextInt();
            }
            scanner.nextLine();
            System.out.println("Digite o nome do funcionario");
            String nome = scanner.nextLine();
            System.out.println("digite o salario");
            Double salario = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);

            listaDeFuncionario.add(funcionario);

        }
        System.out.println("DIgite a id do funcionario que recebera um aumento");
        Integer id = scanner.nextInt();
        int posicaoNaListaDoFuncionario = jaTemEsseId(listaDeFuncionario, id);
        if (posicaoNaListaDoFuncionario == -1){
            System.out.println("Esse id não esta cadastrado!");
        }else {
            System.out.println("Digite a porcentagem de aumento");
            Double aumento = scanner.nextDouble();
            Funcionario funcionario = listaDeFuncionario.get(posicaoNaListaDoFuncionario);
            funcionario.AumentoSalario(id, aumento);

        }
        System.out.println("Lista de funcionários: ");
        for (Funcionario cadaFuncionario : listaDeFuncionario){
            System.out.println(cadaFuncionario.toString());
        }

    }

    private static int jaTemEsseId(List<Funcionario> listaDeFuncionario, Integer id) {
        for (int i = 0; i < listaDeFuncionario.size(); i++){
            if (listaDeFuncionario.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}