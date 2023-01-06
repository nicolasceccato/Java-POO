package util;

public class CurrencyConverter {
    public static final double iof = 0.06;

    public static double converter(double dollars, double dollarPrize){
        double reais = dollars * dollarPrize * (1+iof);
        return reais;
    }

}
