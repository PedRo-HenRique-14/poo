package me.dodas.ticketsystem.tickets;

public class VipTicket extends Ticket {
    private double additional = 25.00;

    public double getPrice() {
        return super.price + additional;
    }
}
