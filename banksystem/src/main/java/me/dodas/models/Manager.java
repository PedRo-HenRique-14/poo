package me.dodas.models;

public class Manager extends Employee{
    private int password;
    private int numberOfManagedEmployees;
    
    public Manager() {}

    public Manager(String name) {
        super(name);
    }
    
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getNumberOfManagedEmployees() {
        return numberOfManagedEmployees;
    }

    public void setNumberOfManagedEmployees(int numberOfManagedEmployees) {
        this.numberOfManagedEmployees = numberOfManagedEmployees;
    }

    public boolean auth(int password) {
        if (this.password != password) {
            System.out.println("Acesso negado!");
            return false;
        }
        System.out.println("Acesso permitido!");
        return true;
    }

    public double getBonus() {
        return super.getBonus() + 1000;
    }
}
