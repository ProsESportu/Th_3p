package pdf5;

import java.util.Scanner;

public class WholesaleToDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj cenę hurtową produktu");
        double wholesalePrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Cena hurtowa: " + wholesalePrice);
        System.out.println("Podaj marżę");
        double margin = sc.nextDouble();
        sc.nextLine();
        System.out.println("Marża: " + margin);
        double retailPrice = calculateRetailPrice(wholesalePrice, margin);
        System.out.println("Cena detaliczna: " + retailPrice);
    }

    public static double calculateRetailPrice(double wholesalePrice, double margin) {
        return wholesalePrice + (wholesalePrice * margin / 100);
    }
}
