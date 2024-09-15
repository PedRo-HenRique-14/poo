package me.dodas.models;

public class Employee {
    private static int numberOfEmployees;
    private int id;
    private String name;
    private String department;
    private double wage;
    private String entryDate;
    private String rg;
    private boolean effective;
    
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
    
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public boolean isEffective() {
        return effective;
    }
    public void dismiss() {
        this.effective = false;
    }
}
