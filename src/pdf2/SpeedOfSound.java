package pdf2;

import java.util.Scanner;

public class SpeedOfSound {
    public static void main(String[] args) {
        final double airSpeed = 343;
        final double waterSpeed = 1490;
        final double steelSpeed = 5100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj medium (air, water, steel): ");
        String medium = sc.nextLine();
        System.out.println("medium: " + medium);
        double speed = switch (medium.toUpperCase()) {
            case "AIR" -> airSpeed;
            case "WATER" -> waterSpeed;
            case "STEEL" -> steelSpeed;
            default -> throw new IllegalArgumentException("Nieznane medium: " + medium);
        };
        System.out.println("Podaj odległość w metrach: ");
        double distance = sc.nextDouble();
        sc.nextLine();
        System.out.println("odległość: " + distance);
        double time = distance / speed;
        System.out.println("Czas: " + time + "s");
    }
}
