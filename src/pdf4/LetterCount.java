package pdf4;

import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String text = sc.nextLine();
        System.out.println("Podany tekst: " + text);
        System.out.println("Podaj literę: ");
        char letter = sc.nextLine().charAt(0);
        System.out.println("Podana litera: " + letter);
        long count = text.chars().filter(ch -> ch == letter).count();

        System.out.println("Litera " + letter + " występuje w tekście " + count + " razy");

    }
}
