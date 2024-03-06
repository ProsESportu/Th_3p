package pdf1;

import java.util.Scanner;

public class Prof {
    public static void main(String[] args) {
        final double margin = 0.4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj cenę detaliczną");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("cena: " + price);
        double profit = price * margin;
        System.out.println("zysk: "+profit);
    }
}
