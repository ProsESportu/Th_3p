package pdf4;

import java.util.Scanner;

public class Excel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sales = new double[6];
        for (int i = 1; i <= 5; i++) {
            System.out.println("Podaj wartość sprzedaży dla sklepu " + i + ": ");
            double salesValue = sc.nextDouble();
            sc.nextLine();
            System.out.println("Wartość sprzedaży wynosi: " + salesValue);
            sales[i] = salesValue;
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Sklep nr " + i + ": " + "*".repeat((int) sales[i] / 100));
        }
    }
}