package main;

public class Cubo extends Quadrado{

    public Cubo(double medidaLados) {
        super(medidaLados);
    }
    @Override
    public double getArea(){
       return 6*super.getArea();
    }
}
