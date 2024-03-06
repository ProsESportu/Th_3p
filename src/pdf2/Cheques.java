package pdf2;

import java.util.Scanner;

public class Cheques {
    public static void main(String[] args) {
        final double baseFee = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość czeków: ");
        int amount = sc.nextInt();
        sc.nextLine();
        System.out.println("Ilość: " + amount);
        double pricePerCheque;
        if (amount >= 60) {
            pricePerCheque = 0.04;
        } else if (amount >= 40) {
            pricePerCheque = 0.06;
        } else if (amount >= 20) {
            pricePerCheque = 0.08;
        } else {
            pricePerCheque = 0.1;
        }
        System.out.println("Cena za czek: " + pricePerCheque);
        double total = baseFee + pricePerCheque * amount;
        System.out.println("Cena: " + total);
    }
}
