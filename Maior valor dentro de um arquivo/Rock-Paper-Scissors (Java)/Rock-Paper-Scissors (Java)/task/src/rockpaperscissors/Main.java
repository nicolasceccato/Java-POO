package rockpaperscissors;

import java.io.*;
import java.util.*;

public class Main {

    private static final String PATH = "/home/nicolas/POO/Java - POO/Java-POO/Maior valor dentro de um arquivo/Rock-Paper-Scissors (Java)/Rock-Paper-Scissors (Java)/task/src/rockpaperscissors/rating.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userOption = "";
        System.out.print("Enter your name: ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName);
        Map<String, Integer> mapUsers = fileReader(PATH);
        int pontuacaoInicial = getUserPoints(mapUsers, userName);
        do {
            userOption = scanner.next();
            while ((!userOption.equals("rock")) && (!userOption.equals("paper")) && (!userOption.equals("scissors")) && (!userOption.equals("!exit")) && (!userOption.equals("!rating"))) {
                System.out.println("Invalid input");
                userOption = scanner.nextLine();
            }

            if (userOption.equals("!exit")) {
                break;
            }

            String computerOptionString = computerOption();


            if (userOption.equals(computerOptionString)) {
                System.out.println("There is a draw " + "(<" + computerOptionString + ">)");
                pontuacaoInicial += 50;
            } else if ((userOption.equals("rock") && computerOptionString.equals("scissors")) || (userOption.equals("scissors") && computerOptionString.equals("paper")) || (userOption.equals("paper") && computerOptionString.equals("rock"))) {
                System.out.println("Well done. The computer chose " + computerOptionString + " and failed");
                pontuacaoInicial += 100;
            } else if ((userOption.equals("scissors") && computerOptionString.equals("rock")) || (userOption.equals("paper") && computerOptionString.equals("scissors")) || (userOption.equals("rock") && computerOptionString.equals("paper"))) {
                System.out.println("Sorry, but the computer chose " + computerOptionString);
            } else {
                System.out.println("Your rating: " + pontuacaoInicial);
            }

            userOption = scanner.nextLine();
        } while (!userOption.equals("!exit"));

        System.out.println("Bye!");

        putNewUserPoints(mapUsers, userName, pontuacaoInicial, PATH);
        scanner.close();
    }

    private static void putNewUserPoints(Map<String, Integer> mapUsers, String userName, int pontuacaoInicial, String path) {
        mapUsers.put(userName, pontuacaoInicial);
        //saveUserPoints(mapUsers, path);

    }

    private static void saveUserPoints(Map<String, Integer> mapUsers, String path) {
        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(path, true)))) {
            for (Map.Entry<String, Integer> entry : mapUsers.entrySet()) {
                String chave = entry.getKey();
                Integer valor = entry.getValue();
                printWriter.println(chave + " " + valor);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int getUserPoints(Map<String, Integer> mapUsers, String userName) {
        if (mapUsers.containsKey(userName)) {
            return mapUsers.get(userName);
        }
        return 350;
    }

    private static String computerOption() {
        Random random = new Random();

        int computerOption = random.nextInt(3);
        String computerOptionString;
        switch (computerOption) {
            case 0:
                computerOptionString = "rock";
                break;
            case 1:
                computerOptionString = "paper";
                break;
            case 2:
                computerOptionString = "scissors";
                break;
            default:
                computerOptionString = "";
                break;
        }

        return computerOptionString;


    }

    private static Map<String, Integer> fileReader(String path) {
        Map<String, Integer> mapUsers = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            while (line != null) {

                String[] linha = line.split(" ");
                String nome = linha[0];
                Integer pontuacao = Integer.valueOf(linha[1]);
                mapUsers.put(nome, pontuacao);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return mapUsers;
    }


}