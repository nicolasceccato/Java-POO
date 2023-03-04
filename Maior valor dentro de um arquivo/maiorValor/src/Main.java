import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File arquivo = new File("dataset_91033.txt");
        List<Integer> listaDeValores = new ArrayList<>();
        int sum = 0;
        try (Scanner scanner = new Scanner(arquivo)) {

            while (scanner.hasNext()) {
                int value = scanner.nextInt();
                listaDeValores.add(value);
                sum += value;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! " + arquivo);

        }
        System.out.println(sum);
    }
}
