package pdf2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rzymskie na arbskie(1) czy arabskie na rzymskie(2)?");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.println("Podaj liczbę rzymską: ");
            String roman = sc.nextLine();
            System.out.println("Liczba arabska: " + romanToArabic(roman));
        } else if (choice == 2) {
            System.out.println("Podaj liczbę arabską: ");
            int arabic = sc.nextInt();
            sc.nextLine();
            System.out.println("Liczba rzymska: " + arabicToRoman(arabic));
        } else {
            System.out.println("Nieprawidłowy wybór");
        }

    }

    static final Map<Character, Integer> digitsMap = Map
            .of('i', 1, 'v', 5, 'x', 10, 'l', 50, 'c', 100, 'd', 500, 'm', 1000);

    public static int romanToArabic(String roman) {
        int result = 0;
        int previousValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = digitsMap.get(roman.charAt(i));
            if (value < previousValue) {
                result -= value;
            } else {
                result += value;
            }
            previousValue = value;
        }
        return result;
    }

    public static String arabicToRoman(int arabic) {
        StringBuilder result = new StringBuilder();
        List<Map.Entry<Character,Integer>> reverseMap = digitsMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();

        for (Map.Entry<Character, Integer> entry : reverseMap) {
            char romanDigit = entry.getKey();
            int arabicValue = entry.getValue();
            while (arabic >= arabicValue) {
                result.append(romanDigit);
                arabic -= arabicValue;
            }
        }
        return result.toString();
    }
}
