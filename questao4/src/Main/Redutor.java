package Main;

public class Redutor {

    public String retirarVogais(String palavra) {
        palavra = palavra.replaceAll("[AEIOUaeiou]", "");
        return palavra;
    }

    public String retirarConsoantes(String palavra) {
        palavra = palavra.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", "");
        return palavra;
    }
}
