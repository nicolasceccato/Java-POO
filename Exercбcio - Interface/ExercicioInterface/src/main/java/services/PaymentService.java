package services;

public interface PaymentService {

    public Double paymentFee (Double amount);

    public Double interest (Double amount, Integer months);

}
