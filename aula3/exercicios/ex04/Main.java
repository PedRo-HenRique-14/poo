package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("-----Confirmador de números pares-----");
        System.out.print("Digite um número aí parcero.\n>> ");
        n = scan.nextInt();
        scan.close();
        if (n%2==0) {
            System.out.printf("Confirmado! O número %s é par.", n);
        }
    }
}
