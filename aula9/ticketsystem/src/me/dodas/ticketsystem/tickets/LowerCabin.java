package me.dodas.ticketsystem.tickets;

public class LowerCabin extends VipTicket {
    private double additional = 25.00;

    public double getPrice() {
        return super.getPrice() + additional;
    }
}
