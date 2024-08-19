package ex03;

import java.util.Scanner;

/*
 * Escreva um programa que receba um número inteiro do usuário e exiba se o número é positivo. 
 * Se o número for negativo, nada será exibido.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Ei amigão! Digita qualquer número aí\n>> ");
        n = scanner.nextInt();
        scanner.close();
        
        if (n >= 0) {
            System.out.printf("Seu número aí: %s", n);
        }
    }
}
