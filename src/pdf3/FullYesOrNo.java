package pdf3;

import java.util.Scanner;

public class FullYesOrNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Czy chcesz zagrać w grę? (Tak/Nie)");
        String choice = sc.nextLine();
        while (!(choice.equals("Tak") || choice.equals("Nie"))) {
            System.out.println("Podaj dobry wybór (Tak/Nie) (case sensitive)");
            choice = sc.nextLine();
        }
        System.out.println("Wybrałeś: " + choice);
    }
}
