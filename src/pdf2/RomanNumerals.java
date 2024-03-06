package pdf2;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę arabską: ");
        int arabic = sc.nextInt();
        sc.nextLine();
        System.out.println("liczba arabska: " + arabic);
        if (arabic < 1 || arabic > 10) {
            System.out.println("Liczba spoza zakresu");
            return;
        }
        String roman = switch (arabic) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> "";
        };
        System.out.println("liczba rzymska: " + roman);
    }
}
