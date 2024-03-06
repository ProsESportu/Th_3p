package pdf2;

import java.util.Scanner;

public class Newton {
    public static void main(String[] args) {
        final double g = 9.8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj masę: ");
        double m = sc.nextDouble();
        sc.nextLine();
        System.out.println("masa: " + m);
        double f = m * g;
        System.out.println("ciężar: " + f);
        if (f > 1000) {
            System.out.println("Obiekt jest ciężki");
        } else if (f < 10) {
            System.out.println("Obiekt jest lekki");
        }
    }
}
