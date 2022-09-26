package areaDoQuadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a dimensão desejada para o lado do quadrado: ");
        double lado = scan.nextDouble();

        Quadrado q1 = new Quadrado(lado);
        Cubo c1 = new Cubo(lado);

        System.out.println("A area do quadrado com lado igual a "+ lado + " é igual a " + q1.getArea());
        System.out.println("A area do cubo com lado igual a "+ lado + " é igual a " + c1.getArea());


    }
}
