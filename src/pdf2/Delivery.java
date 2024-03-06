package pdf2;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wagę przesyłki: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.println("Waga: " + weight);
        System.out.println("Podaj długość trasy: ");
        double distance = sc.nextDouble();
        sc.nextLine();
        System.out.println("Długość trasy: " + distance);
        double pricePer500km;
        if (weight <= 1) {
            pricePer500km = 1.1;
        } else if (weight <= 3) {
            pricePer500km = 2.2;
        } else if (weight <= 5) {
            pricePer500km = 3.7;
        } else {
            pricePer500km = 3.8;
        }

        double price = pricePer500km * Math.ceil(distance / 500);
        System.out.println("Cena: " + price);


    }
}
