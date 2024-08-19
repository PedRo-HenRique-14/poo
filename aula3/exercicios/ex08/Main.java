package ex08;

import java.util.Scanner;

/*
 * Escreva um programa que receba a velocidade de um veículo em km/h e classifique-a como 
 * "Muito Lento" (menos de 40 km/h), "Lento" (40-60 km/h), 
 * "Normal" (61-100 km/h), "Rápido" (101-120 km/h), 
 * ou "Muito Rápido" (acima de 120 km/h).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float velocidade;
        System.out.print("Informe sua velocidade\n>> ");
        velocidade = scanner. nextFloat();
        scanner.close();

        if (velocidade < 40) {
            System.out.println("Muito lento");
        } else if (velocidade >= 40 && velocidade <= 60) {
            System.out.println("Lento");
        } else if (velocidade > 60 && velocidade <= 100) {
            System.out.println("Normal");
        } else if (velocidade > 100 && velocidade <= 120) {
            System.out.println("Rápido");
        } else {
            System.out.println("Muito rápido");
        }
    }
}
