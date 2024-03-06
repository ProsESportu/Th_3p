package pdf2;

import java.util.Scanner;

public class MagicDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dzień: ");
        int day = sc.nextInt();
        sc.nextLine();
        System.out.println("dzień: " + day);
        System.out.println("Podaj miesiąc: ");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.println("miesiąc: " + month);
        System.out.println("Podaj 2 ostatnie cyfry roku: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("rok: " + year);
        if (day * month == year) {
            System.out.println("Data jest magiczna");
        } else {
            System.out.println("Data nie jest magiczna");
        }
    }
}
