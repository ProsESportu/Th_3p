package pdf4;

import java.util.Scanner;

public class Microbes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj początkową liczbę bakterii: ");
        int bacteria = sc.nextInt();
        sc.nextLine();
        while (bacteria < 2) {
            System.out.println("Podaj liczbę bakterii(2 lub więcej)");
            bacteria = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Podałeś liczbę bakterii: " + bacteria);
        System.out.println("Podaj dzienny przyrost bakterii w procentach: ");
        double growth = sc.nextDouble();
        sc.nextLine();
        while (growth < 0) {
            System.out.println("Podaj dzienny przyrost bakterii(większy od 0)");
            growth = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Podałeś dzienny przyrost bakterii w procentach: " + growth);
        System.out.println("Podaj liczbę dni: ");
        int days = sc.nextInt();
        sc.nextLine();
        while (days < 1) {
            System.out.println("Podaj liczbę dni(większa od 0)");
            days = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Podałeś liczbę dni: " + days);
        for (int i = 1; i <= days; i++) {
            bacteria += bacteria * growth;
            System.out.println("Dzień " + i + " liczba bakterii: " + bacteria);
        }
    }
}
