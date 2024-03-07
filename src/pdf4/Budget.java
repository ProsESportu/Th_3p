package pdf4;

import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swój budżet: ");
        double budget = sc.nextDouble();
        sc.nextLine();
        System.out.println("Twój budżet wynosi: " + budget);


        System.out.println("Podaj swoje wydatki(0 aby zakończyć)");
        double expense = sc.nextDouble();

        sc.nextLine();
        budget -= expense;
        System.out.println("Wydajesz: " + expense);
        System.out.println("Twój budżet wynosi: " + budget);
        while (expense != 0) {
            System.out.println("Podaj swoje wydatki(0 aby zakończyć)");
            expense = sc.nextDouble();
            sc.nextLine();
            budget -= expense;
            System.out.println("Wydajesz: " + expense);
            System.out.println("Twój budżet wynosi: " + budget);
        }

    }
}
