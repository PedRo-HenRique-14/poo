package ex07;

import java.util.Scanner;

/*
 * Crie um programa em Java que calcule como uma calculadora básica. 
 * O programa deve solicitar ao usuário dois números e uma operação (adição, subtração, multiplicação ou divisão). 
 * O resultado da operação deve ser exibido no console.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1, n2, res;
        String op;
        System.out.print("Escolha uma operação:\n- adicao\n- subtracao\n- multiplicacao\n- divisao\n>> ");
        op = scanner.next().toLowerCase();
        System.out.print("Digite o primeiro número.\n>> ");
        n1 = scanner.nextFloat();
        System.out.print("Digite o segundo número.\n>> ");
        n2 = scanner.nextFloat();
        scanner.close();

        if(op.equals("adicao")) {
            res = n1+n2;
        } else if (op.equals("subtracao")) {
            res = n1-n2;
        } else if (op.equals("multiplicacao")) {
            res = n1*n2;
        } else {
            if (n2 > 0) {
                res = n1/n2;
            } else {
                System.out.println("Impossível dividir por 0!");
                res = 0;
            }
        }
        System.out.printf("O resultado da %s de %s por %s é %s", op, n1, n2, res);
    }
}
