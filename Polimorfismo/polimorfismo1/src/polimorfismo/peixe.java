package polimorfismo;

public class peixe extends Animal{
    private String corEscama;
    @Override
    public void locomover() {
        System.out.println("nadando");

    }

    @Override
    public void alimentar() {
        System.out.println("comendo substancias");

    }

    @Override
    public void emitirSom() {
        System.out.println("peixe nao faz som");

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolha(){
        System.out.println("soltando bolhas");
    }
}
