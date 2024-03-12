package pdf5;

import java.util.Scanner;

public class KineticEnergy {
    public static double calcKineticEnergy(double m, double v) {
        return 0.5 * m * Math.pow(v, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj masę (kg): ");
        double mass = sc.nextDouble();
        sc.nextLine();
        System.out.println("Masa wynosi: " + mass);
        System.out.println("Podaj prędkość (m/s): ");
        double velocity = sc.nextDouble();
        sc.nextLine();
        System.out.println("Prędkość wynosi: " + velocity);
        System.out.println("Energia kinetyczna wynosi: " + calcKineticEnergy(mass, velocity));
    }
}
