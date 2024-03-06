package pdf2;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę sekund: ");
        int seconds = sc.nextInt();
        sc.nextLine();
        System.out.println("Liczba sekund: " + seconds);
        int days = seconds / 86400;
        int hours = (seconds % 86400) / 3600;
        int minutes = ((seconds % 86400) % 3600) / 60;
        int remainingSeconds = ((seconds % 86400) % 3600) % 60;
        System.out.printf("%d sekund to %d dni, %d godzin, %d minut i %d sekund\n", seconds, days, hours, minutes, remainingSeconds);

    }
}
