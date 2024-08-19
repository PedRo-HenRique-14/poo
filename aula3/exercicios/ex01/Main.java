import java.util.Scanner;

/*
 * Escreva um programa que receba a base e a altura de um triângulo e exiba a área dele.
 * A fórmula é: A = (base * altura) / 2.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, area;
        System.out.print("Digite o tamanho da base do triângulo\n>> ");
        b = scanner.nextFloat();
        System.out.print("Digite o tamanho da altura do triângulo\n>> ");
        a = scanner.nextFloat();
        scanner.close();
        area = (b*a)/2;
        System.out.printf("\nA área do seu triângulo é: %.2f. Parabéns!\n", area);
    }
}