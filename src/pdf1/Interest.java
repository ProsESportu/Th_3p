package pdf1;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kwotę początkową: ");
        double initialAmount = sc.nextDouble();
        sc.nextLine();
        System.out.println("Kwota początkowa: " + initialAmount);
        System.out.println("Podaj liczbę lat: ");
        int years = sc.nextInt();
        sc.nextLine();
        System.out.println("Liczba lat: " + years);
        System.out.println("Podaj oprocentowanie: ");
        double interestRate = sc.nextDouble();
        sc.nextLine();
        System.out.println("Oprocentowanie: " + interestRate);
        System.out.println("Częstotliwość kapitalizacji: ");
        int frequency = sc.nextInt();
        sc.nextLine();
        System.out.println("Częstotliwość kapitalizacji: " + frequency);
        double finalAmount = initialAmount * Math.pow(1 + (interestRate / frequency), years * frequency);
        System.out.println("Kwota końcowa: " + finalAmount);
    }

}
