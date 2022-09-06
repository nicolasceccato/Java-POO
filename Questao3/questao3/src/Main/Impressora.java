package Main;

public class Impressora {
    public void imprimir(int[] sequencia, int quantidadeDeTermos, int somatorio) {
        System.out.printf("A sequencia resultante eh:\n");
        for (int i = 0; i < quantidadeDeTermos; i++){
            System.out.printf("%d ", sequencia[i]);
        }
        System.out.printf("O somatorio dos %d termos da sequencia eh: %d\n", quantidadeDeTermos, somatorio);
    }
}
