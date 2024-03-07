package pdf4;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Podaj liczbę (-99 kończy wprowadzanie): ");
        int number = sc.nextInt();
        while (number != -99) {
            numbers.add(number);
            System.out.println("Podaj liczbę (-99 kończy wprowadzanie): ");
            number = sc.nextInt();
        }
        var min = numbers.stream().min(Integer::compareTo);
        var max = numbers.stream().max(Integer::compareTo);
        if (min.isPresent()) {
            System.out.println("Najmniejsza liczba: " + min.get());
        } else {
            System.out.println("Brak najmniejszej liczby");
        }
        if (max.isPresent()) {
            System.out.println("Największa liczba: " + max.get());
        } else {
            System.out.println("Brak największej liczby");
        }

    }
}
