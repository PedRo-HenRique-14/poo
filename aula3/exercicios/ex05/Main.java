package ex05;

import java.util.Scanner;

/*
 * Escreva um programa que receba a velocidade de um veículo em km/h 
 * e exiba uma mensagem dizendo se está dentro do limite (até 80 km/h) ou acima do limite.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float velocidade;
        System.out.println("Você está andando dentro do limite? Vamos descobrir!\n");
        System.out.print("Qual a velocidade do seu veículo?\n>> ");
        velocidade = scan.nextFloat();
        scan.close();
        if (velocidade > 80) {
            System.out.println("Ta rápido demais amigão, tira o pé um pouco...");
        } else {
            System.out.println("Ta tranquilo, pode acelerar :D");
        }
    }
}
