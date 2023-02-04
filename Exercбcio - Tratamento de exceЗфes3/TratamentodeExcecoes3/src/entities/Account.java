package entities;

import entities.exceptions.BusinessException;

public class Account {
    private Integer numer;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer numer, String holder, Double balance, Double withdrawLimit) {
        this.numer = numer;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit (Double amount){
        balance += amount;
    }
    public void withdraw (Double amount) throws BusinessException {
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(Double amount) throws BusinessException {

        if (amount > withdrawLimit){
            throw new BusinessException("Erro de saque! A quantia desejada excede o limite!");
        }
        if (amount > balance){
            throw new BusinessException("Erro de saque! Saldo insuficiente!");
        }

    }

    public Integer getNumer() {
        return numer;
    }

    public void setNumer(Integer numer) {
        this.numer = numer;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
