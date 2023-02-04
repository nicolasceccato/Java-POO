package application;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,10,7);
        Stream<Integer> stream = list.stream().map(x -> x*10);
        stream.forEach(System.out::println);
        System.out.println("////////////////////**********///////////////");
        list.forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo contendo os votos: ");
        String path = scanner.nextLine();
        Map <String,Integer> votos = new TreeMap<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            List<Integer> s = new ArrayList<>();

            String line = bufferedReader.readLine();

            while (line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int cont = Integer.parseInt(fields[1]);

                if (votos.containsKey(name)){
                    int votosTemp = votos.get(name);
                    votos.put(name, cont + votosTemp);
                }else{
                    votos.put(name, cont);
                }
                line = bufferedReader.readLine();

            }

            for (String key : votos.keySet()){
                System.out.println(key + ": " + votos.get(key));
            }

        }catch (IOException e){
            throw new RuntimeException("ERRO "+ e.getMessage());
        }


    }




}
