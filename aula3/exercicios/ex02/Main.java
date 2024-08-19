package ex02;

import java.util.Scanner;

/*
 * Escreva um programa que receba dois números decimais (double) do usuário e exiba a média deles.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        System.out.print("Informe o primeiro número double\n>> ");
        num1 = scan.nextDouble();
        System.out.print("Informe o segundo número double\n>> ");
        num2 = scan.nextDouble();
        scan.close();
        System.out.printf("\nA média dos dois números é %.2f.", (num1+num2)/2);
    }
}
