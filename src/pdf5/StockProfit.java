package pdf5;

import java.util.Scanner;

public class StockProfit {
    public static double profit(double buyPrice, double sellPrice, double shareCount, double saleCommission, double buyCommission) {
        return ((shareCount * buyPrice) - buyCommission) - ((shareCount * sellPrice) + saleCommission);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj cenę zakupu");
        double buyPrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj cenę sprzedaży");
        double sellPrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj ilość akcji");
        double shareCount = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj prowizję od sprzedaży");
        double saleCommission = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj prowizję od zakupu");
        double buyCommission = sc.nextDouble();
        sc.nextLine();
        System.out.println("Zysk: " + profit(buyPrice, sellPrice, shareCount, saleCommission, buyCommission));


    }
}
