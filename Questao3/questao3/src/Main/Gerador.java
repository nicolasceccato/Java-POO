package Main;

public class Gerador {

    public int[] gerarSequenciaDe(int quantidade) {
        int [] retorno = new int[quantidade];
        retorno[0] = 0;
        retorno [1] = 1;

        for(int i = 2 ; i < quantidade;i++){
            retorno[i] = retorno[i-1]+retorno[i-2];
        }
        return retorno;
    }

    public int somarSequencia(int[] p, int x) {
        int soma = 0;
        for (int i = 0; i < x; i++){
            soma = soma + p[i];
        }
        return soma;
    }
}
