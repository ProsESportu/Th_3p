package pdf2;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę zakupionych książek: ");
        int books = sc.nextInt();
        sc.nextLine();
        System.out.println("Ilość: " + books);
        int points = switch (books) {
            case 0 -> 0;
            case 1 -> 5;
            case 2 -> 15;
            case 3 -> 30;
            default -> 60;
        };
        System.out.println("Punkty: " + points);
    }
}
