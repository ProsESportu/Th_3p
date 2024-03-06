package pdf1;

import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę przejechanych kilometrów");
        double km = sc.nextDouble();
        sc.nextLine();
        System.out.println("Przejechane kilometry: " + km);
        System.out.println("Podaj liczbę zużytych litrów paliwa");
        double l = sc.nextDouble();
        sc.nextLine();
        System.out.println("Zużyte litry paliwa: " + l);
        double fuelEfficiency = km / l;
        System.out.println(fuelEfficiency + " km/l");


    }
}
