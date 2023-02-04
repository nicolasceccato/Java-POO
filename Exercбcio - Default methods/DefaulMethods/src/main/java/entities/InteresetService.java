package entities;

import java.security.InvalidParameterException;

public interface InteresetService {
    public double getInterestRate();

    default double payment (double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Quantidade de meses tem que ser maior que 1!");
        }
        return amount * Math.pow( 1 + getInterestRate() / 100 , months);
    }

}
