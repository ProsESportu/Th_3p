package pdf2;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RomanNumerals {
    public static void main(String[] args) {
        //test
        for (int i = 1; i < 4000; i++) {
            String roman = arabicToRoman(i);
            int arabic = romanToArabic(roman);
            if (i != arabic) {
                System.out.println("Error: " + i + " -> " + roman + " -> " + arabic);
                return;
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Rzymskie na arabskie(1) czy arabskie na rzymskie(2)?");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.println("Podaj liczbę rzymską: ");
            String roman = sc.nextLine();
            System.out.println("Liczba arabska: " + romanToArabic(roman.toLowerCase()));
        } else if (choice == 2) {
            System.out.println("Podaj liczbę arabską: ");
            int arabic = sc.nextInt();
            sc.nextLine();
            System.out.println("Liczba rzymska: " + arabicToRoman(arabic));
        } else {
            System.out.println("Nieprawidłowy wybór");
        }

    }

    static final Pattern pattern = Pattern.compile("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$", Pattern.CASE_INSENSITIVE);
    static final Map<String, Integer> digitsMap = Map
            .ofEntries(
                    Map.entry("i", 1),
                    Map.entry("iv", 4),
                    Map.entry("v", 5),
                    Map.entry("ix", 9),
                    Map.entry("x", 10),
                    Map.entry("xl", 40),
                    Map.entry("l", 50),
                    Map.entry("xc", 90),
                    Map.entry("c", 100),
                    Map.entry("cd", 400),
                    Map.entry("d", 500),
                    Map.entry("cm", 900),
                    Map.entry("m", 1000)
            );

    public static int romanToArabic(String roman) throws IllegalArgumentException {
        if (!pattern.matcher(roman).matches()) {
            throw new IllegalArgumentException("Invalid roman number " + roman);
        }
        int result = 0;
        int previousValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = digitsMap.get(Character.toString(roman.charAt(i)));
            if (value < previousValue) {
                result -= value;
            } else {
                result += value;
            }
            previousValue = value;
        }
        return result;
    }

    public static String arabicToRoman(int arabic) throws IllegalArgumentException {
        if (arabic < 1 || arabic > 3999) {
            throw new IllegalArgumentException("Invalid arabic number " + arabic);
        }
        StringBuilder result = new StringBuilder();
        List<Map.Entry<String, Integer>> reverseMap = digitsMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList().reversed();
//        StringBuilder tempBuffer = new StringBuilder();
        for (Map.Entry<String, Integer> entry : reverseMap) {
            String romanDigit = entry.getKey();
            int arabicValue = entry.getValue();

            while (arabic >= arabicValue) {
                result.append(romanDigit);
                arabic -= arabicValue;
            }

        }
//        result.append(tempBuffer);
        return result.toString();
    }
}
