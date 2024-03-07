package pdf4;

import java.util.Random;
import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        String[] images = {"🍒", "🍊", "🍋", "🍉", "🍇", "🍓"};
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean play = true;
        double won = 0;
        double lost = 0;
        while (play) {

            System.out.println("Podaj liczbę pieniędzy: ");
            double money = sc.nextDouble();
            sc.nextLine();
            System.out.println("Twoje pieniądze: " + money);
            lost += money;
            System.out.println("Naciśnij enter aby zagrać");
            sc.nextLine();
            int image1 = random.nextInt(images.length);
            int image2 = random.nextInt(images.length);
            int image3 = random.nextInt(images.length);
            System.out.println(images[image1] + " " + images[image2] + " " + images[image3]);
            if (image1 == image2 && image2 == image3) {
                double winnings = money * 3;
                won += winnings;
                System.out.println("Wygrałeś! Twoje pieniądze: " + winnings);

            } else if (image1 == image2 || image2 == image3 || image1 == image3) {
                double winnings = money * 2;
                won += winnings;
                System.out.println("Wygrałeś! Twoje pieniądze: " + winnings);
            } else {
                System.out.println("Przegrałeś! Twoje pieniądze: " + 0);
            }
            System.out.println("Czy chcesz zagrać jeszcze raz? (t/n)");
            String answer = sc.nextLine();
            if (answer.equals("n")) {
                play = false;
            }
        }
        System.out.println("Wygrane: " + won);
        System.out.println("Przegrane: " + lost);
    }
}
