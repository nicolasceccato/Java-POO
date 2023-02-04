package application;

import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Caminho do arquivo: ");

        String path = scanner.nextLine();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            List<Funcionario> listaDeFuncionarios = new ArrayList<>();
            String funcionarioCSV = bufferedReader.readLine();

            while (funcionarioCSV != null) {

                String[] fields = funcionarioCSV.split(",");
                String nome = fields[0];
                String email = fields[1];
                Double salario = Double.parseDouble(fields[2]);
                Funcionario funcionario = new Funcionario(nome, email, salario);
                listaDeFuncionarios.add(funcionario);
                funcionarioCSV = bufferedReader.readLine();
            }
            System.out.print("Qual o valor de salario deseja filtrar: ");
            Double valorDesejado = scanner.nextDouble();
            List<String> email = listaDeFuncionarios.stream().filter(x -> x.getSalario() > valorDesejado).map(x -> x.getEmail()).sorted().collect(Collectors.toList());
            System.out.println("Email de quem ganha mais do que $" + String.format("%.2f", valorDesejado));
            email.forEach(System.out::println);

            System.out.println("A soma dos salários dos funcionários cujo nome começa com a letra 'M' é igual a: ");

            Double somaDosMs = listaDeFuncionarios.stream().filter(x -> x.getNome().charAt(0) == 'M').map(x -> x.getSalario()).reduce(0.0, (x, y) -> x + y);

            System.out.println(somaDosMs);

        } catch (IOException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }


    }

}
