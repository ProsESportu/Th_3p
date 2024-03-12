package pdf5;

import java.util.Scanner;

public class ImpToMetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj długość w metrach");
        double meters = sc.nextDouble();
        while (meters <= 0) {
            System.out.println("Podaj długość większą od 0");
            meters = sc.nextDouble();
        }
        sc.nextLine();
        System.out.println("Długość w metrach: " + meters);
        menu();
        int choice = sc.nextInt();
        sc.nextLine();
        while (choice != 4) {
            switch (choice) {
                case 1 -> System.out.println("Długość w kilometrach: " + showKilometers(meters));
                case 2 -> System.out.println("Długość w calach: " + showInches(meters));
                case 3 -> System.out.println("Długość w stopach: " + showFeet(meters));
                default -> System.out.println("Niepoprawny wybór");
            }
            menu();
            choice = sc.nextInt();
            sc.nextLine();
        }
    }

    public static double showKilometers(double meters) {
        return meters * 0.001;
    }

    public static double showInches(double meters) {
        return meters * 39.37;
    }

    public static double showFeet(double meters) {
        return meters * 3.281;
    }

    public static void menu() {
        final String choices = """
                1. konwersja na kilometry,
                2. konwersja na cale,
                3. konwersja na stopy,
                4. wyjście z programu
                """;
        System.out.println("Wybierz jedną z opcji: ");
        System.out.println(choices);


    }
}
