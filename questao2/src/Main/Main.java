package Main;

public class Main {
    public static void main (String[] args){
        Leitor leitor = new Leitor();
        Calculadora calculadora = new Calculadora();
        Ordenadora ordenadora = new Ordenadora();
        Impressora impressora = new Impressora();

        int[] V = leitor.lerVetor();
        int[] U = leitor.lerVetor();
        int[] T = calculadora.novoVetor(V, U);
        ordenadora.ordenar(T);
        System.out.println("Vetor V:");
        impressora.imprimir(V);
        System.out.println("Vetor U:");
        impressora.imprimir(U);
        System.out.println("Vetor T:");
        impressora.imprimir(T);
    }
}
