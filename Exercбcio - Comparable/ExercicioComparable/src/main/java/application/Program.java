package application;

import entities.Funcionario;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Funcionario> funcionarioList = new ArrayList<>();

        String path = "C:\\Users\\nicolas.ceccato\\Desktop\\Funcionarios.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String funcionarioCsv = bufferedReader.readLine();

            while (funcionarioCsv != null) {
                String[] fields = funcionarioCsv.split(",");
                funcionarioList.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
                funcionarioCsv = bufferedReader.readLine();
            }
            String pathFinal = "C:\\Users\\nicolas.ceccato\\Desktop\\FuncionariosOrdenados.txt";
            File funcionariosEmOrdem = new File(pathFinal);
            Collections.sort(funcionarioList);
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFinal))) {

                for (Funcionario funcionario : funcionarioList) {
                    System.out.println(funcionario.getNome() + ", " + funcionario.getSalario());
                    bufferedWriter.write(funcionario.getNome() + ", " + funcionario.getSalario());
                    bufferedWriter.newLine();
                }
            }
            } catch (IOException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }

