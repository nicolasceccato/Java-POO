import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static final int VALOR = 9999;

    public static void main(String[] args) {

        File arquivo = new File("dataset_91022.txt");
        List<Integer> listaMaiores = new ArrayList<>();

        try (Scanner scanner = new Scanner(arquivo)) {

            while (scanner.hasNext()) {
                int nextInt = scanner.nextInt();
                if (nextInt >= VALOR) {
                    listaMaiores.add(nextInt);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(listaMaiores.size());
    }
}
