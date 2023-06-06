package org.oliveiratec;

public class Account {
    private long id;
    private double balance;

    public static double DEPOSIT_FEE_PRECENTAGE = 0.02;
    public Account(){
    }
    public Account(long id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            amount -= amount * DEPOSIT_FEE_PRECENTAGE;
            balance += amount;
        }
    }
    public void  withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
    }

    public double fullWithdraw(){
        double aux = balance;
        balance = 0.0;
        return aux;
    }
}