package pdf4;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int userWon = 0;
        int computerWon = 0;
        for (int i = 0; i < 10; i++) {
            int user = random.nextInt(6) + 1;
            int computer = random.nextInt(6) + 1;
            System.out.println("Rzut użytkownika: " + user);
            System.out.println("Rzut komputera: " + computer);
            if (user > computer) {
                userWon++;
                System.out.println("Użytkownik wygrał");
            } else if (user < computer) {
                computerWon++;
                System.out.println("Komputer wygrał");
            } else {
                System.out.println("Remis");
            }
        }
        System.out.println("Użytkownik wygrał: " + userWon);
        System.out.println("Komputer wygrał: " + computerWon);
        System.out.println("Wygrał: " + (userWon > computerWon ? "użytkownik" : "komputer") + "!");
    }
}
