package me.dodas;

import me.dodas.models.Account;
import me.dodas.models.Client;

public class Application {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Client client = new Client();

        client.name = "Pedro";
        myAccount.accountHolder = client;
        myAccount.deposit(1200.00);

        if (!myAccount.withdraw(1100.00)) {
            System.out.println("Seu saldo é insuficiente!");
            return;
        }
        System.out.printf("Olá %s.%n", myAccount.accountHolder.name);
        System.out.printf("Seu novo saldo é %s.", myAccount.balance);
    }
}