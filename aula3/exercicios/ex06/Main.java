package ex06;

import java.util.Scanner;

/*
 * Escreva um programa que receba uma nota de 0 a 10 e exiba se a nota é suficiente para aprovação (7 ou mais) ou se é insuficiente.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota;
        System.out.println("Digite a nota.\n>> ");
        nota = scan.nextFloat();
        scan.close();

        if (nota >= 7) {
            System.out.println("Aprovado. Parabéns!");
        } else {
            System.out.println("Reprovado...");
        }
    }
}
