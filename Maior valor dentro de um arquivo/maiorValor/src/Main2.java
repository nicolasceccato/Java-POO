import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        File arquivo = new File("dataset_91007.txt");
        List<Integer> listaDeValores = new ArrayList<>();

        try (Scanner scanner = new Scanner(arquivo)) {

            while (scanner.hasNext()) {
                listaDeValores.add(scanner.nextInt());

            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! " + arquivo);

        }
        int maior = Collections.max(listaDeValores);
        System.out.println(maior);
    }
}
