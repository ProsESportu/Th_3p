package pdf5;

import java.util.Scanner;

public class Interest {
    public static double presentValue(double futureValue, double annualInterest, int years) {
        return futureValue / Math.pow(1 + annualInterest, years);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartość przyszłą: ");
        double futureValue = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj oprocentowanie: ");
        double annualInterest = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj liczbę lat: ");
        int years = sc.nextInt();
        sc.nextLine();
        System.out.println("Wartość obecna: " + presentValue(futureValue, annualInterest, years));
    }
}
