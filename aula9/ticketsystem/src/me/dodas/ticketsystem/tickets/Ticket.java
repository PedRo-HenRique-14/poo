package me.dodas.ticketsystem.tickets;

public class Ticket {
    protected double price = 100;
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double printPrice() {
        return this.price;
    }
}