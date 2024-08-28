package me.dodas.models;

public class Account {
    public int accountNumber;
    public Client accountHolder;
    public double balance;

    public boolean withdraw(double amount) {
        if (amount > this.balance) {
            return false;
        }
        this.balance -= amount;
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
