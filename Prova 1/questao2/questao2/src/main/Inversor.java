package main;

public class Inversor {
    public static String inverterString(String texto) {
        char []letras = texto.toCharArray();
        char []invertido = new char[letras.length ];
//
        int index = letras.length - 1;
        for(char letra : letras) {
            invertido[index] = letra;
            index--;
        }
        return new String(invertido);
    }
}

