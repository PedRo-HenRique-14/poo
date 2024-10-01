package me.dodas.ticketsystem.tickets;

public class UpperCabin extends VipTicket {
    private double additional = 35.00;

    public double getPrice() {
        return super.getPrice() + additional;
    }
}
