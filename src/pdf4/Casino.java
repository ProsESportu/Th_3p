package pdf4;

import java.util.Random;
import java.util.Scanner;

public class Casino {
    public static final String[] images = {"🍒", "🍊", "🍋", "🍉", "🍇", "🍓"};

    public static void main(String[] args) {
        final double profitMargin = 0.2;
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
            int random1 = random.nextInt(100);
            if (lost - (won + money * 3) > lost * profitMargin && random1 > 60) {
                System.out.println(winAll(random));
                won += money * 3;
                System.out.println("Wygrałeś: " + money * 3);
            } else if (lost - (won + money * 1.5) > lost * profitMargin && random1 > 30) {
                System.out.println(winHalf(random));
                won += money * 1.5;
                System.out.println("Wygrałeś: " + money * 1.5);
            } else{
                System.out.println(lose(random));
                System.out.println("Przegrałeś: " + money);
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

    public static String winAll(Random random) {
        int index = random.nextInt(6);
        return images[index].repeat(3);
    }

    public static String winHalf(Random random) {
        int index1 = random.nextInt(6);
        int index2 = random.nextInt(6);
        int index3 = random.nextInt(6);
        while (!(index1 == index2 || index2 == index3 || index1 == index3)) {
            index1 = random.nextInt(6);
            index2 = random.nextInt(6);
            index3 = random.nextInt(6);
        }
        return images[index1] + " " + images[index2] + " " + images[index3];
    }

    public static String lose(Random random) {
        int index1 = random.nextInt(6);
        int index2 = random.nextInt(6);
        int index3 = random.nextInt(6);
        while (index1 == index2 || index2 == index3 || index1 == index3) {
            index1 = random.nextInt(6);
            index2 = random.nextInt(6);
            index3 = random.nextInt(6);
        }
        return images[index1] + " " + images[index2] + " " + images[index3];
    }

}
