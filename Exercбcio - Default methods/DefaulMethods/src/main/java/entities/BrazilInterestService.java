package entities;

public class BrazilInterestService implements InteresetService{

    private static Double interestRate = 2.0;

    public BrazilInterestService() {
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
