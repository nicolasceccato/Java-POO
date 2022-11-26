package polimorfismo;

import java.sql.SQLOutput;

public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");

    }

    @Override
    public void alimentar() {
        System.out.println("comendo vegetais");


    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");

    }

}
