package pdf4;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj długość boku: ");
        int side = sc.nextInt();
        for (int i = 0; i < side; i++) {
            System.out.println("*".repeat(side));
        }
    }
}
