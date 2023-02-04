package entities;

public class UsaInterestService implements InteresetService {
    private static Double interestRate = 1.0;

    public UsaInterestService() {

    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
