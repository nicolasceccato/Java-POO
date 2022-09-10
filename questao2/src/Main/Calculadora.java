package Main;

public class Calculadora {
    public int[] novoVetor(int[] v, int[] u) {
            int[] retorno = new int [10];
            for (int i = 0; i < 10; i++){
                if (ehPar(v[i]) && ehPar(u[i])){
                    retorno[i] = v[i] + u[i];
                }else{
                    if (ehImpar(v[i]) && ehImpar(u[i])){
                        retorno[i] = v[i] - u[i];
                    }else{
                        retorno[i] = v[i]*u[i];
                    }
                }

            }
        return retorno;
    }

    private boolean ehImpar(int i) {
        if (i % 2 != 0){
            return true;
        }
        return false;
    }

    private boolean ehPar(int i) {
        if (i % 2 == 0){
            return true;
        }
        return false;
    }
}
