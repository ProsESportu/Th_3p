package pdf4;

import java.util.Scanner;

public class Rainfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę lat: ");
        int years = sc.nextInt();
        sc.nextLine();
        while (years < 1) {
            System.out.println("Podaj liczbę lat(większa od 0)");
            years = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Podałeś liczbę lat: " + years);
        double[][] rainfalls = new double[years][12];
        for (int i = 1; i <= years; i++) {

            for (int j = 1; j <= 12; j++) {
                System.out.println("Podaj ilość opadów w " + j + " miesiącu: ");
                double rainfall = sc.nextDouble();
                sc.nextLine();
                while (rainfall < 0) {
                    System.out.println("Podaj ilość opadów(większa od 0)");
                    rainfall = sc.nextDouble();
                    sc.nextLine();
                }
                rainfalls[i - 1][j - 1] = rainfall;
            }
        }
        double totalRainfall = 0;
        for (int j = 0; j < 12; j++) {
            double sum = 0;
            for (int i = 0; i < years; i++) {
                sum += rainfalls[i][j];
                totalRainfall += rainfalls[i][j];
            }
            System.out.println("Średnia opadów w " + (j + 1) + " miesiącu wynosi: " + sum / years);
        }
        System.out.println("Łączna suma opadów w ciągu " + years + " lat wynosi: " + totalRainfall);


    }
}
