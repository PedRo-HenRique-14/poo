package me.dodas;

import me.dodas.models.Employee;

public class BonusControl {
    private double totalBonus;

    public double getTotalBonus() {
        return totalBonus;
    }

    public void register(Employee employee) {
        this.totalBonus += employee.getBonus();
    }
}
