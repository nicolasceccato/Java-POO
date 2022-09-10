package Main;

public class Ordenadora {
    /*
        public int[] ordenar(int[] v) {
            for (int i = 0; i < 10; i++){
                int menor = i;
                for(int j = i+1; j < 10; j++){
                    if (v[j]<v[i]){
                        menor = j;
                    }
                }
                int auxiliar = v[menor];
                v[menor] = v[i];
                v[i] = auxiliar;
            }
            return v;
        }
    }*/
    public void ordenar(int[] v) {
        for (int i = 0; i < 10; i++) {
            int menor = i;
            for (int j = 0; j < 9; j++) {
                if (v[j] > v[j + 1]) {
                    int auxiliar = v[j + 1];
                    v[j + 1] = v[j];
                    v[j] = auxiliar;
                }
            }
        }

    }
}