package pdf2;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj wynik: ");
            scores[i] = sc.nextDouble();
            sc.nextLine();
        }
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / scores.length;
        System.out.println("Średnia: " + average);
        if (average > 90) {
            System.out.println("Ocena: 5");
        } else if (average > 80) {
            System.out.println("Ocena: 4");
        } else if (average > 70) {
            System.out.println("Ocena: 3");
        } else if (average > 60) {
            System.out.println("Ocena: 2");
        } else {
            System.out.println("Ocena: 1");
        }
    }
}
