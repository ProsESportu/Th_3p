package pdf4;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę dni(większa od 1)");
        int days = sc.nextInt();
        sc.nextLine();
        while (days < 1) {
            System.out.println("Podaj liczbę dni(większa od 1)");
            days = sc.nextInt();
            sc.nextLine();
        }
        double sum = 0;
        double salary = 0.01;
        for (int i = 1; i <= days; i++) {
            salary *= 2;
            sum += salary;
            System.out.println("Dzień " + i + " zarobek: " + salary);
        }
        System.out.println("Suma zarobku: " + sum);

    }
}
