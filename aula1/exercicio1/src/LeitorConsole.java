import java.util.Scanner;

public class LeitorConsole {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome:\n>> ");
        System.out.printf("Olá %s", scan.nextLine());
        scan.close();
    }
}