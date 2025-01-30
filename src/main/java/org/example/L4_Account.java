package org.example;

public class L4_Account {

    private double balance;


    public void withdraw(double amount) throws L5_InsufficientFundException {
        if(amount > balance){
            throw new L5_InsufficientFundException("Insufficient Funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
