package pdf4;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Zgadnij liczbę: ");
        int guess = sc.nextInt();

        int attempts = 1;
        while (guess != number) {
            if (guess < number) {
                System.out.println("Za mało!");
            } else {
                System.out.println("Za dużo!");
            }
            System.out.println("Zgadnij liczbę: ");
            guess = sc.nextInt();
            attempts++;
        }
        System.out.println("Zgadłeś!");
        System.out.println("Liczba prób: " + attempts);
    }
}
