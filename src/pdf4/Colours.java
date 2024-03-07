package pdf4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Colours {
    public static void main(String[] args) {
        final String[] colours = {"Czerwony", "Zielony", "Niebieski", "Pomarańczowy", "Żółty"};
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(colours.length);
            System.out.println("Wybierz kolor: ");
            String userColour = sc.nextLine();
            if (userColour.equalsIgnoreCase(colours[index])) {
                System.out.println("Zgadłeś!");
                counter++;
            } else if (Arrays.stream(colours).map(String::toLowerCase).toList().contains(userColour.toLowerCase())) {
                System.out.println("Nie zgadłeś!");
            } else {
                System.out.println("Nie ma takiego koloru!");
            }
        }
        System.out.println("Liczba poprawnych odpowiedzi: " + counter);
        System.out.println("Poprawność: " + (counter / 10.0 * 100) + "%");
    }
}
