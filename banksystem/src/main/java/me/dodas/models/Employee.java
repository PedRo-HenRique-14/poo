package me.dodas.models;

public class Employee {
    protected static int numberOfEmployees;
    protected int id;
    protected String name;
    protected String department;
    protected double wage;
    protected String entryDate;
    protected String cpf;
    protected boolean effective;
    
    public Employee(){
        this.id = ++numberOfEmployees;
        this.effective = true;
    }
    public Employee(String name){
        this.id = ++numberOfEmployees;
        this.name = name;
        this.effective = true;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    
    public String getEntryDate() {
        return entryDate;
    }
    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public boolean isEffective() {
        return effective;
    }
    public void dismiss() {
        this.effective = false;
    }

    public double getBonus() {
        return wage * 0.10;
    }
}
