package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um valor para o lado do quadrado: ");
        Scanner scan = new Scanner(System.in);
        double lado = scan.nextDouble();

        Quadrado q1 = new Quadrado(lado);
        Cubo c1 = new Cubo(lado);

    System.out.println("Um quadrado de lado " + lado + " tem area igual a: "+ q1.getArea());
    System.out.println("Um cubo de lado " + lado + " tem area igual a: "+ c1.getArea());
    }
}
