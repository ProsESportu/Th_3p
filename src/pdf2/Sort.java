package pdf2;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj imię: ");
            names[i] = sc.nextLine();
        }
        Arrays.stream(names).sorted().forEach(System.out::println);
    }
}
