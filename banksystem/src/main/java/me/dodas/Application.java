package me.dodas;

import me.dodas.models.Account;
import me.dodas.models.Client;
import me.dodas.models.Employee;

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
        System.out.printf("Seu novo saldo é %s.\n", myAccount.balance);
        
        Employee employee1 = new Employee("João");
        Employee employee2 = new Employee();
        employee2.setName("Maria");

        System.out.println("Employee1: " + employee1.getId());
        System.out.println("Employee2: " + employee2.getId());
    }
}