package pdf4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj prędkość (km/h): ");
        double speed = sc.nextDouble();
        System.out.println("Prędkość wynosi: " + speed);
        System.out.println("Podaj czas (h): ");
        double time = sc.nextDouble();
        System.out.println("Czas wynosi: " + time);
        FileWriter fileWriter = new FileWriter("distance.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 1; i <= time; i++) {
            printWriter.println(i + " " + (speed * i));
            System.out.println("Po " + i + " godzinie przejedziesz: " + (speed * i) + " km");
        }
        printWriter.close();
        fileWriter.close();
    }
}
