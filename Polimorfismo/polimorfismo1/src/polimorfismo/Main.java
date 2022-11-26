package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        peixe P = new peixe();
        Ave A = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara a = new Arara();


        m.setPeso(35.5f);
        m.setCorDoPelo("Caramelo");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println(m.getCorDoPelo() + " " + m.peso);

        A.locomover();
        P.locomover();
        r.locomover();
        c.locomover();
        k.emitirSom();
        c.emitirSom();


    }
}
