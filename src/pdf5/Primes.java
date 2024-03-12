package pdf5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Primes {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        File file = new File("primes.txt");
        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 1; i <= 10000; i++) {
            if (isPrime(i)) {
                printWriter.println(i);
            }
        }
        printWriter.close();
        System.out.println("Podaj liczbę: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Liczba " + number + (isPrime(number) ? " jest" : " nie jest") + " liczbą pierwszą.");

    }
}
