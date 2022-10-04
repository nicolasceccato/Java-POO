package main;

public class Removedor {
    public String removerConsoante(String palavra) {
        palavra = palavra.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", "");
        return palavra;
    }

    public String removerVogal(String palavra) {
        palavra = palavra.replaceAll("[AEIOUaeiou]", "");
        return palavra;
    }
}
