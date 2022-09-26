package areaDoQuadrado;

public class Quadrado {
    private double medidaLados;

    public Quadrado(double medidaLados){
        this.medidaLados = medidaLados;
    }

    public void setMedidaLados(double medidaLados) {
        this.medidaLados = medidaLados;
    }
    public double getMedidaLados(){
        return medidaLados;
    }
    public double getArea(){
         return medidaLados * medidaLados;
    }
}
