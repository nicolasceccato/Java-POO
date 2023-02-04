package services;

public class PaypalService implements PaymentService{

    private Double interestFee = 0.01;
    private Double paymenteFee = 0.02;
    @Override
    public Double paymentFee(Double amount) {
        return amount * 1.01;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return null;
    }
}
