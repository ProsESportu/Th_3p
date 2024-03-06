package pdf1;

import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {
        final double taxRate = 0.0675;
        final double tipRate = 0.2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj cenę");
        double price = sc.nextDouble();
        System.out.println("cena: " + price);
        double tax = price * taxRate;
        System.out.println("podatek: " + tax);
        double tip = price * tipRate;
        System.out.println("napiwek: " + tip);
        double totalPrice = price + tax + tip;
        System.out.println("łączna cena: " + totalPrice);

    }
}
