package pdf3;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę z zakresu 10-24: ");
        int num = sc.nextInt();
        System.out.println("Podano liczbę: " + num);
        while (!(num >= 10 && num <= 24)) {
            System.out.println("Podaj liczbę z zakresu 10-24☠ ");
            num = sc.nextInt();
            System.out.println("Podano liczbę: " + num);
        }

    }
}
