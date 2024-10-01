package me.dodas.models;

public class Account {
    private int accountNumber;
    private Client accountHolder;
    protected double balance;
    private double rate = 0.05f;
    
    public Account(Client accountHolder) {
        this.accountHolder = accountHolder;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public Client getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public boolean withdraw(double amount) {
        if (amount > this.balance) {
            return false;
        }
        double fee = amount * rate;
        this.balance -= amount;
        System.out.printf("Taxa de saque: %.2f\n", fee);
        return true;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }
        
        this.balance += amount;
        return true;
    }

    public boolean transfer(Account target, double amount) {
        if(!withdraw(amount)) {
            return false;
        }
        target.deposit(amount);
        return true;
    }
}
