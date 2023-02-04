package application;

import entities.Produtos;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        String a = "maria";
        String b = "joao";
        String c = "maria";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        Produtos ac  = new Produtos("aa", 50.0);
        Produtos ab = new Produtos("aa", 50.0);
        System.out.println("/////////////////////////////");
        System.out.println(ac.hashCode());
        System.out.println(ab.hashCode());
        System.out.println(ac.equals(ab));

        String x = "TESTE";
        String y = new String("TESTE");
        String z = "TESTE";
        System.out.println("////////////////////////////");
        System.out.println(x == y);
        System.out.println(x == z);



    }
}
