package pdf2;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz swój pakiet(a,b,c)");
        String pakiet = sc.nextLine();
        System.out.println("Wybrany pakiet: " + pakiet);
        double aBasePrice = 39.99;
        double bBasePrice = 59.99;
        double cBasePrice = 69.99;
        double basePrice = switch (pakiet.toLowerCase()) {
            case "a" -> aBasePrice;
            case "b" -> bBasePrice;
            case "c" -> cBasePrice;
            default -> throw new IllegalArgumentException("Nieznany pakiet: " + pakiet);
        };
        int aFreeMinutes = 450;
        int bFreeMinutes = 900;
        int cFreeMinutes = 0;
        double freeMinutes = switch (pakiet.toLowerCase()) {
            case "a" -> aFreeMinutes;
            case "b" -> bFreeMinutes;
            case "c" -> cFreeMinutes;
            default -> throw new IllegalArgumentException("Nieznany pakiet: " + pakiet);
        };
        double aPricePerMinute = 0.45;
        double bPricePerMinute = 0.4;
        double cPricePerMinute = 0.0;
        double pricePerMinute = switch (pakiet.toLowerCase()) {
            case "a" -> aPricePerMinute;
            case "b" -> bPricePerMinute;
            case "c" -> cPricePerMinute;
            default -> throw new IllegalArgumentException("Nieznany pakiet: " + pakiet);
        };
        System.out.println("Podaj liczbę minut: ");
        int minuty = sc.nextInt();
        sc.nextLine();
        System.out.println("Liczba minut: " + minuty);
        double price = basePrice + Math.max(0, minuty - freeMinutes) * pricePerMinute;
        System.out.println("Cena: " + price);
        double bDiff = price - (bBasePrice + Math.max(0, minuty - bFreeMinutes) * bPricePerMinute);
        double cDiff = price - (cBasePrice + Math.max(0, minuty - cFreeMinutes) * cPricePerMinute);
        if (bDiff > 0) {
            System.out.println("Zaoszczędzisz " + bDiff + " zł wybierając pakiet b");
        }
        if (cDiff > 0) {
            System.out.println("Zaoszczędzisz " + cDiff + " zł wybierając pakiet c");
        }
    }
}
