package pdf3;

import java.util.Scanner;

public class YesNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Czy chcesz zagrać w grę? (t/n)");
        String choice = sc.nextLine();
        while (!(choice.equalsIgnoreCase("t") || choice.equalsIgnoreCase("n"))) {
            System.out.println("podaj dobry wybór (t/n)");
            choice = sc.nextLine();
        }
        System.out.println("Wybrałeś: " + choice.toLowerCase());
    }
}