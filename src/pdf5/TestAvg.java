package pdf5;

import java.util.Arrays;
import java.util.Scanner;

public class TestAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] testScores = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj wynik testu " + (i + 1));
            testScores[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println("Wynik testu " + (i + 1) + ": " + testScores[i]);
            int grade = getGrade(testScores[i]);
            System.out.println("Ocena: " + grade);

        }
        double average = calculateAverage(testScores);
        System.out.println("Średnia: " + average);


    }

    public static double calculateAverage(double[] testScores) throws IllegalArgumentException {
        var wht = Arrays.stream(testScores).average();
        if (wht.isPresent()) {
            return wht.getAsDouble();
        } else throw new IllegalArgumentException("Empty array");
    }

    public static int getGrade(double score) {
        if (score >= 90) return 5;
        else if (score >= 80) return 4;
        else if (score >= 70) return 3;
        else if (score >= 60) return 2;
        else return 1;
    }
}
