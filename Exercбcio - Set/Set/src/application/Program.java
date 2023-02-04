package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("Quantos estudantes no curso A");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Código do aluno " + (i + 1));
            a.add(scanner.nextInt());
        }
        System.out.println("Quantos estudantes no curso B");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Código do aluno " + (i + 1));
            b.add(scanner.nextInt());
        }

        System.out.println("Quantos estudantes no curso C");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Código do aluno " + (i + 1));
            c.add(scanner.nextInt());
        }
        for (Integer cada : a) {
            System.out.print(cada + " ");
        }
        System.out.println();

        for (Integer cada : b) {
            System.out.print(cada + " ");
        }
        System.out.println();

        for (Integer cada : c) {
            System.out.print(cada + " ");
        }
        System.out.println();
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        for (Integer cada : total) {
            System.out.println(cada + " ");
        }
        System.out.println();

        System.out.println("Número total de estudantes " + total.size());
    }
}