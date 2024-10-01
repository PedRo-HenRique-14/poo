package me.dodas;

import me.dodas.models.Account;
import me.dodas.models.Client;
import me.dodas.models.Employee;
import me.dodas.models.Manager;
import me.dodas.models.VipAccount;

public class Application {
    public static void main(String[] args) {
        BonusControl bc = new BonusControl();

        Manager manager = new Manager("João");
        manager.setCpf("123.456.789-10");
        manager.setWage(20000);
        bc.register(manager);
        
        Employee employee1 = new Employee("Maria");	
        employee1.setCpf("109.876.543-21");
        employee1.setWage(2000);
        bc.register(employee1);

        System.out.printf("Bônus total: %s\n\n", bc.getTotalBonus());

        Account acc1 = new Account(new Client("Pedro"));
        acc1.setBalance(5000);
        acc1.withdraw(100);
        
        VipAccount vAcc = new VipAccount(new Client("Marcos"));
        vAcc.setBalance(10000);
        vAcc.withdraw(100);

        System.out.printf("acc1: %.2f\nvAcc: %.2f", acc1.getBalance(), vAcc.getBalance());
    }
}