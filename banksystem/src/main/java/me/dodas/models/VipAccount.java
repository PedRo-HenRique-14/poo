package me.dodas.models;

public class VipAccount extends Account {
    private float rate = 0.01f;

    public VipAccount(Client accountHolder) {
        super(accountHolder);
    }

    public boolean withdraw(double amount) {
        if (amount > super.balance) {
            return false;
        }
        double fee = amount - rate;
        super.balance -= amount + fee;
        System.out.printf("Taxa de saque: %.2f\n", fee);
        return true;
    }
}
