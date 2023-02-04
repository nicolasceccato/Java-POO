package application;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingNames {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        String url = "C:\\Users\\nicolas.ceccato\\Desktop\\nomes.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(url))) {

            String nome = bufferedReader.readLine();

            while (nome != null) {
                list.add(nome);
                nome = bufferedReader.readLine();
            }
            Collections.sort(list);



            for (String s : list) {
                System.out.println(s);

            }
            File arquivoFinal = new File("C:\\Users\\nicolas.ceccato\\Desktop\\nomesEmOrdem.txt");
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoFinal))) {
                for (String s : list) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());



        }


    }
}
