package pdf5;

import java.util.Arrays;
import java.util.Scanner;

public class PaintCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj cenę farby za litr");
        double paintPrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Cena farby za litr: " + paintPrice);
        System.out.println("Podaj liczbę pokojów");
        int rooms = sc.nextInt();
        sc.nextLine();
        System.out.println("Liczba pokojów: " + rooms);
        double[] roomAreas = new double[rooms];
        for (int i = 0; i < rooms; i++) {
            System.out.println("Podaj powierzchnię pokoju " + (i + 1));
            roomAreas[i] = sc.nextDouble();
            sc.nextLine();
        }
        double totalArea = Arrays.stream(roomAreas).sum();
        System.out.println("Całkowita powierzchnia: " + totalArea);
        double LitresOfPaint = howManyLitresOfPaint(totalArea);
        System.out.println("Litrów farby potrzebnych: " + LitresOfPaint);
        double workHours = howManyWorkHours(totalArea);
        System.out.println("Godzin pracy potrzebnych: " + workHours);
        double paintCost = calculatePaintCost(LitresOfPaint, paintPrice);
        System.out.println("Koszt farby: " + paintCost);
        double workCost = calculateWorkCost(workHours);
        System.out.println("Koszt pracy: " + workCost);
        double totalCost = calculateTotalCost(paintCost, workCost);
        System.out.println("Całkowity koszt: " + totalCost);
    }

    public static double howManyLitresOfPaint(double area) {
        final double paintPerMeter = 1.5 / 10;
        return area * paintPerMeter;
    }

    public static double howManyWorkHours(double area) {
        final double workHoursPerMeter = 8.0 / 10;
        return area * workHoursPerMeter;
    }

    public static double calculatePaintCost(double LitresOfPaint, double paintPrice) {
        return LitresOfPaint * paintPrice;
    }

    public static double calculateWorkCost(double workHours) {
        final double workPrice = 18.0;
        return workHours * workPrice;
    }

    public static double calculateTotalCost(double paintCost, double workCost) {
        return paintCost + workCost;
    }
}
