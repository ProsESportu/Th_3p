package pdf2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wagę w kilogramach: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.println("Waga: " + weight);
        System.out.println("Podaj wzrost w metrach: ");
        double height = sc.nextDouble();
        sc.nextLine();
        System.out.println("Wzrost: " + height);
        double bmi = weight / (height * height);
        System.out.println("pdf2.BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Niedowaga");
        } else if (bmi < 25) {
            System.out.println("Waga prawidłowa");
        } else {
            System.out.println("Nadwaga");
        }
    }
}
