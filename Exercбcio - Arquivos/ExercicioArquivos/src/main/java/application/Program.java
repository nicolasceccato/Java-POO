package application;

import entities.Products;

import java.io.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //C:\Users\nicolas.ceccato\Desktop\in.csv
        Scanner scanner = new Scanner(System.in);
        List<Products> list = new ArrayList<>();

        System.out.println("Entre com o caminho do arquivo");
        String srcFileStr = scanner.nextLine();

        File sourceFile = new File(srcFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        System.out.println("pasta criada: " + success);

        String targetFilStr = sourceFolderStr + "\\out\\summary.csv";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFileStr))){
            String itemCsv = bufferedReader.readLine();

            while (itemCsv != null){
                System.out.println(itemCsv);
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Products(name,price,quantity));

                itemCsv = bufferedReader.readLine();
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFilStr))){

                for (Products item : list){
                    bufferedWriter.write(item.getName() + ", " + String.format("%.2f", item.total()));
                    bufferedWriter.newLine();
                }
                System.out.println(targetFilStr + " copiado com sucesso!");

            }
        }catch (IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
