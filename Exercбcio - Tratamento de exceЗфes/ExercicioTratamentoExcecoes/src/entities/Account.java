package entities;

import entities.exceptions.BalanceException;
import entities.exceptions.LimitException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit (Double amount){
        balance += amount;
    }
    public void withdraw(Double amount) throws LimitException, BalanceException {
        if (amount > withdrawLimit){
            throw new LimitException("The amount exceeds withdrwaw limit!");
        }
        if (amount > balance ){
            throw new BalanceException("Not enough balance!");
        }
        balance -= amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
