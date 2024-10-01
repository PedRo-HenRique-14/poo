package me.dodas.ticketsystem;

import me.dodas.ticketsystem.tickets.LowerCabin;
import me.dodas.ticketsystem.tickets.UpperCabin;
import me.dodas.ticketsystem.tickets.VipTicket;

public class App {
    public static void main(String[] args) throws Exception {
        VipTicket vTicket = new VipTicket();
        UpperCabin uCabin = new UpperCabin();
        LowerCabin lCabin = new LowerCabin();

        System.out.printf("Ingresso VIP: %s\nCamarote inferior: %s\nCamarote superior: %s\n", 
            vTicket.getPrice(), 
            lCabin.getPrice(),
            uCabin.getPrice()
        );
    }
}
