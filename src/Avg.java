import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Wprowadź wynik %d testu\n", i);
            double score = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Wynik %d testu: %3.2f\n", i, score);
            sum += score;
            count++;
        }
        double mean = sum / count;
        System.out.println("średnia wynosi: " + mean);
    }
}
