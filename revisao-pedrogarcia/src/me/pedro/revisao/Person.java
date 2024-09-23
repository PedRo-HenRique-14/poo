package me.pedro.revisao;

import java.time.LocalDate;

public class Person {
    private String name;
    private String dateOfBirth;
    private int height;

    public Person() {}

    public Person(String name, String date, int height) {
        this.name = name;
        this.dateOfBirth = date;
        this.height = height;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String date) {
        this.dateOfBirth = date;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        // 
        int currentYear = LocalDate.now().getYear();
        return currentYear - Integer.valueOf(dateOfBirth.split("-")[2]);
    }

    public void printAllData() {
        System.out.println("\n--------------------------------");
        System.out.printf("Nome: %s\n", name);
        System.out.printf("Idade: %s", getAge());
        System.out.printf("Altura: %s\n", height);
        System.out.printf("Data de nascimento: %s\n", dateOfBirth);
        System.out.println("--------------------------------\n");
    }
}
