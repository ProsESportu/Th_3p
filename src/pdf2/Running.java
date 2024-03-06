package pdf2;

import java.util.Arrays;
import java.util.Scanner;

public class Running {
    static class Runner implements Comparable<Runner> {
        String name;
        double time;

        public Runner(String name, double time) {
            this.name = name;
            this.time = time;
        }

        public int compareTo(Runner r) {
            return Double.compare(this.time, r.time);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Runner[] runners = new Runner[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj imię: ");
            String name = sc.nextLine();
            System.out.println("Podaj czas: ");
            double time = sc.nextDouble();
            sc.nextLine();
            runners[i] = new Runner(name, time);
        }

        System.out.println("Wyniki: ");
        Arrays.stream(runners).sorted().forEach((e) -> System.out.println(e.name + " " + e.time));

    }
}
