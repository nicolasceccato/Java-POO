package application;

import entities.Retangulo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Retangulo a = new Retangulo();

        System.out.println("Digite a largura e algura de um triangulo");
        a.largura = scanner.nextDouble();
        a.altura = scanner.nextDouble();

        System.out.println("AREA = " + a.area());
        System.out.println("PERÍMETRO = " + a.perimetro());
        System.out.println("DIAGONAL = " + a.diagonal());
    }
}
