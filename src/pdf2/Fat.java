package pdf2;

import java.util.Scanner;

public class Fat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę kalorii: ");
        double calories = sc.nextDouble();
        sc.nextLine();
        System.out.println("Kalorie: " + calories);
        System.out.println("Podaj liczbę gramów tłuszczu: ");
        double fat = sc.nextDouble();
        sc.nextLine();
        System.out.println("Tłuszcz: " + fat);
        double fatCalories = fat * 9;
        double fatPercentage = (fatCalories / calories);
        if (fatPercentage < 0.3) {
            System.out.println("Produkt jest niskotłuszczowy");
        } else {
            System.out.println("Produkt nie jest niskotłuszczowy");
        }
        if (fatCalories > calories) {
            System.out.println("Błędne dane");
            return;
        }
        System.out.println("Procent kalorii z tłuszczu: " + fatPercentage * 100 + "%");
    }
}
